package org.apache.hadoop.security.alias;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.security.Credentials;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * A CredentialProvider for UGIs. It uses the credentials object associated
 * with the current user to find credentials. This provider is created using a
 * URI of "user:///".
 */
public class UserProvider extends CredentialProvider {
  public static final String SCHEME_NAME = "user";
  private final UserGroupInformation user;
  private final Credentials credentials;

  private UserProvider() throws IOException {
    user = UserGroupInformation.getCurrentUser();
    credentials = user.getCredentials();
  }

  @Override
  public boolean isTransient() {
    return true;
  }

  @Override
  public synchronized CredentialEntry getCredentialEntry(String alias) {
    byte[] bytes = credentials.getSecretKey(new Text(alias));
    if (bytes == null) {
      return null;
    }
    return new CredentialEntry(
        alias, new String(bytes, StandardCharsets.UTF_8).toCharArray());
  }

  @Override
  public synchronized CredentialEntry createCredentialEntry(String name, char[] credential)
      throws IOException {
    Text nameT = new Text(name);
    if (credentials.getSecretKey(nameT) != null) {
      throw new IOException("Credential " + name +
          " already exists in " + this);
    }
    credentials.addSecretKey(new Text(name),
        new String(credential).getBytes("UTF-8"));
    return new CredentialEntry(name, credential);
  }

  @Override
  public synchronized void deleteCredentialEntry(String name) throws IOException {
    byte[] cred = credentials.getSecretKey(new Text(name));
    if (cred != null) {
      credentials.removeSecretKey(new Text(name));
    } else {
      throw new IOException("Credential " + name +
          " does not exist in " + this);
    }
  }

  @Override
  public String toString() {
    return SCHEME_NAME + ":///";
  }

  @Override
  public synchronized void flush() {
    user.addCredentials(credentials);
  }

  public static class Factory extends CredentialProviderFactory {

    @Override
    public CredentialProvider createProvider(URI providerName,
                                             Configuration conf) throws IOException {
      if (SCHEME_NAME.equals(providerName.getScheme())) {
        return new UserProvider();
      }
      return null;
    }
  }

  @Override
  public synchronized List<String> getAliases() throws IOException {
    List<String> list = new ArrayList<String>();
    List<Text> aliases = credentials.getAllSecretKeys();
    for (Text key : aliases) {
      list.add(key.toString());
    }
    return list;
  }
}
