import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.tsystems.Conditions;

import static org.junit.Assert.*;

/*
 * Test for <code>Conditions</code>.
 */
public class ConditionsTest {

    Conditions systemUnderTest;

    @Before
    public void before() {
        systemUnderTest = new Conditions();
    }

    @Test
    public void testIf() {
        systemUnderTest.testIf();
    }

    @Test
    public void testSwitch() {
        systemUnderTest.testSwitch();
    }

    @Test
    public void testTricky() {
        systemUnderTest.testTricky();
    }

    @After
    public void after() {
        systemUnderTest = null;
    }

}
