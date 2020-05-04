import myHttpTester.*;

import java.io.File;

public class TestConfig {
    private static final String filePath = "src/test/resources/serverInfo.json";
    public TestData testdata;
    public String configFilePath;
    public String serverUrl;
    public int serverPort;
    public boolean isSsl;
    public String authenticationMethod;
    public String mlUser;
    public String mlPasswd;
    public boolean internalUser;
    public String databaseName;
    public String forestName;

    public TestConfig(){
        this.configFilePath = getConfigFilePath();
        if(configFilePath.equals("CONFIG_FILE_NOT_FOUND"))
            throw new IllegalStateException("Could not initialize TestConfig. Unable to find config file");
        this.testdata = new ParseTestData(configFilePath).parse();
        setProperties(testdata);
    }

    private void setProperties(TestData testdata){
        ConnectionInfo connectioninfo = testdata.getConnectionInfo();
        Authentication authn = testdata.getAuthentication();
        DBConfig dbConfig = testdata.getDBConfig();
        this.serverUrl = connectioninfo.getServerURL();
        this.serverPort = Integer.parseInt(connectioninfo.getServerPort());
        this.isSsl = Boolean.parseBoolean(connectioninfo.getIsSSL());
        this.authenticationMethod = connectioninfo.getAuthenticationMethod();
        this.mlUser = authn.getMlUser();
        this.mlPasswd = authn.getMlPasswd();
        this.internalUser = Boolean.parseBoolean(authn.getInternalUser());
        this.databaseName = dbConfig.getDatabaseName();
        this.forestName = dbConfig.getForestName();
    }

    public void printConfig(){
        System.out.println("configFilePath : " + configFilePath);
        System.out.println("serverUrl : " + serverUrl);
        System.out.println("serverPort : " + serverPort);
        System.out.println("isSsl : " + isSsl);
        System.out.println("authenticationMethod : " + authenticationMethod);
        System.out.println("mlUser : " + mlUser);
        System.out.println("mlPasswd : " + mlPasswd);
        System.out.println("internalUser : " + internalUser);
        System.out.println("databaseName : " + databaseName);
        System.out.println("forestName : " + forestName);
    }

    public String getConfigFilePath(){
        File file = new File(filePath);
        return (file.exists()) ? file.getAbsolutePath() : "CONFIG_FILE_NOT_FOUND";
    }





}
