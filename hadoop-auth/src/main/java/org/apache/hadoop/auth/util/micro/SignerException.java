package org.apache.hadoop.auth.util.micro;

// 签名不合法异常
public class SignerException extends Exception {

  static final long serialVersionUID = 0;

  public SignerException(String msg) {
    super(msg);
  }
}
