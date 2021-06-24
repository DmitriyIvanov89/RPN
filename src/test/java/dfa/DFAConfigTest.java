package dfa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DFAConfigTest {

    private static DFAConfig config;
    private static List<DFAConfig.DFAState> testStateDefinition;
    private static List<DFAConfig.DFATransition> testTransitionsDefinition;
    private static String testStartId;

    @Before
    public void beforeEach() {
        testStateDefinition = new ArrayList<>();
        testTransitionsDefinition = new ArrayList<>();
        testStartId = "S0";
        config = new DFAConfig(testStateDefinition, testTransitionsDefinition, testStartId);

    }

    @Test
    public void getStateDefinition() {
        Assert.assertEquals(testStateDefinition, config.getStateDefinition());
    }

    @Test
    public void getTransitionsDefinition() {
        Assert.assertEquals(testTransitionsDefinition, config.getTransitionsDefinition());
    }

    @Test
    public void getStartId() {
        Assert.assertEquals(testStartId, config.getStartId());
    }
}