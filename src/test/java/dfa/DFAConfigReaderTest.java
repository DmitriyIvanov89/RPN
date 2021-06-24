package dfa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DFAConfigReaderTest {

    private DFAConfig testConfig;

    @Before
    public void beforeEach() {
        List<DFAConfig.DFAState> testStateDefinition = new ArrayList<>();
        List<DFAConfig.DFATransition> testTransitionsDefinition = new ArrayList<>();
        String testStartId = "S0";
        testConfig = new DFAConfig(testStateDefinition, testTransitionsDefinition, testStartId);
    }

    @Test(expected = AssertionError.class)
    public void readConfigJsonTest() throws IOException {
        String configPath = "d:\\my\\RPE_repo\\src\\main\\resources\\dfaConfig.json";
        DFAConfigReader testReader = new DFAConfigReader(configPath);
        Assert.assertEquals(testConfig, testReader.readConfigJson());
    }
}