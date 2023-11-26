package org.apache.hadoop.auth.util.provider;

import java.security.SecureRandom;
import java.util.Random;

// 基于随机数的 SignerSecretProvider，可以滚动

public class RandomSignerSecretProvider extends RolloverSignerSecretProvider {

  private final Random rand;

  public RandomSignerSecretProvider() {
    super();
    rand = new SecureRandom();
  }

  @Override
  protected byte[] generateNewSecret() {
    byte[] secret = new byte[32]; // 32 bytes = 256 bits
    rand.nextBytes(secret);
    return secret;
  }
}
