import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GeneralTest {

    @BeforeClass
    public void setupSanityTest() {
        myResult = 8 / 2 * (2 + 2);
        setMyResult(myResult);
    }

    private int myResult;
    private int myField;
    private int result;

    @Test
    public void sanityTest() {
        // Using System.out for simplicity
        System.out.println("This is a simple dummy test");
        SoftAssert assertion = new SoftAssert();
        myField = myResult;
        System.out.println("Setting my field: [" + myField + "] at timestamp: " + System.currentTimeMillis());
        assertion.assertTrue(result == myField);
    }

    private void setMyResult(int result) {
        System.out.println("Setting my result: [" + result + "] at timestamp: " + System.currentTimeMillis());
        result = result;
    }
}
