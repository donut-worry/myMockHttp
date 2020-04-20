package myhttp;

import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

public class BasicAuth {
    private String user;
    private String password;
    public BasicAuth(String user, String password){
        this.user = user;
        this.password = password;
    }
    public CredentialsProvider getCreds() {
        CredentialsProvider provider = new BasicCredentialsProvider();
        provider.setCredentials(
                AuthScope.ANY,
                new UsernamePasswordCredentials(user, password)
        );
        return provider;
    }
}
