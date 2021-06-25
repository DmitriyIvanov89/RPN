package dfa;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFATest extends TestCase {


    private State testStartState;
    private DFAConfig testDFAConfig;
    private DFAConfigReader testReader;
    private DFA testDFA;

    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";

    @Before
    public void beforeEach() throws IOException {
        testReader = new DFAConfigReader(CONFIG_PATH);
        testDFAConfig = testReader.readConfigJson();
        testDFA = new DFA(testDFAConfig);
        testStartState = new State("S0", false);
    }

    public void testGetStartState() {
        Assert.assertEquals(testStartState, testDFA.getStartState());
    }

    public void testCheckString() {
    }

    public void testGreedyTraversal() {
    }
}