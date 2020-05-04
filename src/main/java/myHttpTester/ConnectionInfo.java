// ConnectionInfo.java

package myHttpTester;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ConnectionInfo {
    private String serverURL;
    private String serverPort;
    private String isSSL;
    private String authenticationMethod;

    @JsonProperty("serverUrl")
    public String getServerURL() { return serverURL; }
    @JsonProperty("serverUrl")
    public void setServerURL(String value) { this.serverURL = value; }

    @JsonProperty("serverPort")
    public String getServerPort() { return serverPort; }
    @JsonProperty("serverPort")
    public void setServerPort(String value) { this.serverPort = value; }

    @JsonProperty("isSsl")
    public String getIsSSL() { return isSSL; }
    @JsonProperty("isSsl")
    public void setIsSSL(String value) { this.isSSL = value; }

    @JsonProperty("authenticationMethod")
    public String getAuthenticationMethod() { return authenticationMethod; }
    @JsonProperty("authenticationMethod")
    public void setAuthenticationMethod(String value) { this.authenticationMethod = value; }
}