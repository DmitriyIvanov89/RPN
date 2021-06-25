package dfa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class DFATest {

    private State startState;
    private DFA dfa;

    private final static String CONFIG_PATH = "e:\\IT\\JAVA\\my_project\\rpn_repo\\RPN\\src\\main\\resources\\dfaConfig.json";

    @Before
    public void before() throws IOException {
        DFAConfigReader reader = new DFAConfigReader(CONFIG_PATH);
        DFAConfig dfaConfig = reader.readConfigJson();
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
        State currState = startState;
        String expression = "2 + 2";
        Assert.assertTrue(dfa.checkString(expression));
    }

    @Test(expected = StackOverflowError.class)
    public void testGreedyTraversal() {
        State state = new State("S1", true);
        String trace = "2";
        TraversalResult traversalResult = new TraversalResult(state, trace);
        String expression = "2+2";
        CharacterIterator iterator = new StringCharacterIterator(expression);
        Assert.assertEquals(traversalResult, dfa.greedyTraversal(iterator));
    }
}