package dfa;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class StateTest {

    State firstState;
    State nextState;
    Map<Character, State> testTransit;
    char symbol;

    @Before
    public void beforeEach() {
        firstState = new State("S1", true);
        nextState = new State("S2", false);
        testTransit = new HashMap<>();
        symbol = '.';
    }


    @Test
    public void getId() {
        Assert.assertEquals("S1", firstState.getId());
    }

    @Test
    public void isFinite() {
        assertTrue(firstState.isFinite());
    }

    @Test
    public void getName() {
        firstState.setName("NUMBER");
        Assert.assertEquals("NUMBER", firstState.getName());
    }

    @Test
    public void addTransition() {
        testTransit.put(symbol, nextState);
        Assert.assertEquals(nextState, testTransit.get(symbol));

    }

    @Test
    public void getTransition() {
        firstState.addTransition(symbol, nextState);
        Assert.assertEquals(nextState, firstState.getTransition(symbol));
    }
}