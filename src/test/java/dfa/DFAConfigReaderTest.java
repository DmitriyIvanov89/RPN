package dfa;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

public class DFAConfigReaderTest {

    private static final String configPath = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
    private static DFAConfigReader testReader;
    private static BufferedReader reader;
    private static DFAConfig testConfig;

    @BeforeClass
    public static void beforeClass() {
        testReader = new DFAConfigReader(configPath);
    }

    @Test
    public void readConfigJsonTest() throws IOException {
        Assert.assertEquals(testConfig, testReader.readConfigJson());
    }
}