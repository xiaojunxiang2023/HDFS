package org.apache.hadoop.auth.util;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.hadoop.auth.util.micro.SignerException;
import org.apache.hadoop.auth.util.provider.SignerSecretProvider;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

// 使用 SHA摘要对字符串进行签名并验证
public class Signer {
  private static final String SIGNATURE = "&s=";
  private static final String SIGNING_ALGORITHM = "HmacSHA256";

  private SignerSecretProvider secretProvider;

  /**
   * Creates a Signer instance using the specified SignerSecretProvider.  The
   * SignerSecretProvider should already be initialized.
   *
   * @param secretProvider The SignerSecretProvider to use
   */
  public Signer(SignerSecretProvider secretProvider) {
    if (secretProvider == null) {
      throw new IllegalArgumentException("secretProvider cannot be NULL");
    }
    this.secretProvider = secretProvider;
  }

  /**
   * Returns a signed string.
   *
   * @param str string to sign.
   *
   * @return the signed string.
   */
  public synchronized String sign(String str) {
    if (str == null || str.length() == 0) {
      throw new IllegalArgumentException("NULL or empty string to sign");
    }
    byte[] secret = secretProvider.getCurrentSecret();
    String signature = computeSignature(secret, str);
    return str + SIGNATURE + signature;
  }

  /**
   * Verifies a signed string and extracts the original string.
   *
   * @param signedStr the signed string to verify and extract.
   *
   * @return the extracted original string.
   *
   * @throws SignerException thrown if the given string is not a signed string or if the signature is invalid.
   */
  public String verifyAndExtract(String signedStr) throws SignerException {
    int index = signedStr.lastIndexOf(SIGNATURE);
    if (index == -1) {
      throw new SignerException("Invalid signed text: " + signedStr);
    }
    String originalSignature = signedStr.substring(index + SIGNATURE.length());
    String rawValue = signedStr.substring(0, index);
    checkSignatures(rawValue, originalSignature);
    return rawValue;
  }

  /**
   * Returns then signature of a string.
   *
   * @param secret The secret to use
   * @param str string to sign.
   *
   * @return the signature for the string.
   */
  protected String computeSignature(byte[] secret, String str) {
    try {
      SecretKeySpec key = new SecretKeySpec((secret), SIGNING_ALGORITHM);
      Mac mac = Mac.getInstance(SIGNING_ALGORITHM);
      mac.init(key);
      byte[] sig = mac.doFinal(StringUtils.getBytesUtf8(str));
      return new Base64(0).encodeToString(sig);
    } catch (NoSuchAlgorithmException | InvalidKeyException ex) {
      throw new RuntimeException("It should not happen, " + ex.getMessage(), ex);
    }
  }

  protected void checkSignatures(String rawValue, String originalSignature)
      throws SignerException {
    byte[] orginalSignatureBytes = StringUtils.getBytesUtf8(originalSignature);
    boolean isValid = false;
    byte[][] secrets = secretProvider.getAllSecrets();
    for (int i = 0; i < secrets.length; i++) {
      byte[] secret = secrets[i];
      if (secret != null) {
        String currentSignature = computeSignature(secret, rawValue);
        if (MessageDigest.isEqual(orginalSignatureBytes,
            StringUtils.getBytesUtf8(currentSignature))) {
          isValid = true;
          break;
        }
      }
    }
    if (!isValid) {
      throw new SignerException("Invalid signature");
    }
  }
}
