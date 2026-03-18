import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class testingMethod{

        @Test
    public void testForAdditionOfTwoNumbers(){
    int actual = Method.additionOfTwoNumbers(5, 6);
    int expected = 11;
    assertEquals(expected, actual);
    }

        @Test
    public void testForPrimeNumbers(){
    assertTrue(Method.primeNumbers(7));
    }


        @Test
    public void testForSquaringANumber(){
    int expected = Method.squareOfANumber(6);    
    int actual = 36;
    assertEquals(expected, actual);
    }
}
