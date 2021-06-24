package dfa;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;

public class StateTest {

    State testState = new State("S1", true);

    @Test
    public void getId() {
        Assert.assertEquals("S1", testState.getId());
    }

    @Test
    public void isFinite() {
        assertTrue(testState.isFinite());
    }

    @Test
    public void getName() {
        State testState = new State("S1", true);
        testState.setName("NUMBER");
        Assert.assertEquals("NUMBER", testState.getName());
    }

    @Test
    public void addTransition() {
        Map<Character, State> testTransit = new HashMap<>();
        State testState = new State("S1", true);
        State nextState = new State("S2", false);
        char symbol = '.';
        testTransit.put(symbol, nextState);
        Assert.assertEquals(nextState, testTransit.get(symbol));

    }

    @Test
    public void getTransition() {
        Map<Character, State> testTransit = new HashMap<>();
        State testState = new State("S1", true);
        State nextState = new State("S2", false);
        char symbol = '.';
        testState.addTransition(symbol, nextState);
        Assert.assertEquals(nextState, testState.getTransition(symbol));
    }
}