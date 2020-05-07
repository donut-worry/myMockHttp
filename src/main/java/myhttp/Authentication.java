// Authentication.java
package myhttp;

import com.fasterxml.jackson.annotation.*;

public class Authentication {
    private String mlUser;
    private String mlPasswd;
    private String internalUser;

    @JsonProperty("mlUser")
    public String getMlUser() { return mlUser; }
    @JsonProperty("mlUser")
    public void setMlUser(String value) { this.mlUser = value; }

    @JsonProperty("mlPasswd")
    public String getMlPasswd() { return mlPasswd; }
    @JsonProperty("mlPasswd")
    public void setMlPasswd(String value) { this.mlPasswd = value; }

    @JsonProperty("internalUser")
    public String getInternalUser() { return internalUser; }
    @JsonProperty("internalUser")
    public void setInternalUser(String value) { this.internalUser = value; }
}