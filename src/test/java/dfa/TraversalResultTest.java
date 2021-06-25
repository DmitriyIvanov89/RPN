package dfa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TraversalResultTest {

    private TraversalResult testTraversalResult;
    private State testState;
    private String testTrace;

    @Before
    public void beforeEach() {
        testState = new State("S0", false);
        testTrace = "0";
        testTraversalResult = new TraversalResult(testState, testTrace);
    }

    @Test
    public void getState() {
        Assert.assertEquals(testState, testTraversalResult.getState());
    }

    @Test
    public void getTrace() {
        Assert.assertEquals(testTrace, testTraversalResult.getTrace());
    }
}