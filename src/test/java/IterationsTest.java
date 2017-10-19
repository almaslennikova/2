import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.tsystems.IterationOperators;

/**
 * Test for <code>Iterations</code>.
 */
public class IterationsTest {

    IterationOperators systemUnderTest;

    @Before
    public void init() {
        systemUnderTest = new IterationOperators();
    }

    @Test
    public void testWhile() {
        systemUnderTest.testWhile();
    }

    @Test
    public void testDoWhile() {
        systemUnderTest.testDoWhile();
    }

    @Test
    public void testFor() {
        systemUnderTest.testFor();
    }

    @Test
    public void testForEach() {
        systemUnderTest.testForEach();
    }

    @After
    public void after() {
        systemUnderTest = null;
    }

}
