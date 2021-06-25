package dfa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class DFATest {

    private State startState;
    private DFAConfig dfaConfig;
    private DFAConfigReader reader;
    private DFA dfa;

    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";

    @Before
    public void before() throws IOException {
        reader = new DFAConfigReader(CONFIG_PATH);
        dfaConfig = reader.readConfigJson();
        dfa = new DFA(dfaConfig);
        startState = new State("S0", false);
        startState.setName("DEFAULT");
    }

    @Test
    public void testGetStartState() {
        Assert.assertEquals(startState, dfa.getStartState());
    }

    @Test
    public void testCheckString() {
    }

    @Test
    public void testGreedyTraversal() {
    }
}