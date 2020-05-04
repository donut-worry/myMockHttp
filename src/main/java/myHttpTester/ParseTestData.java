package myHttpTester;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ParseTestData {
    private String path;

    public ParseTestData(String path){
        this.path = path;
    }

    public TestData parse(){
        ObjectMapper mapper = new ObjectMapper();
        TestData testdata = null;
        try {
            testdata = mapper.readValue(new File(path), TestData.class);
        } catch (IOException e) {
            System.out.println("Could not parse configuration from : " + path);
            e.printStackTrace();
        }
        return testdata;
    }

}
