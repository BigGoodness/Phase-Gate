import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class testingLevel4Tasks{

        @Test
    public void Additionoftwonumbers(){
        Level4tasks twonumbers = new Level4tasks();
        int expected = Level4tasks.addingTwoNumbers(3, 3);
        int actual = 6;
        assertEquals(expected, actual);

    }


        @Test
    public void Evennumbers(){
        assertTrue(Level4tasks.checkingIfANumberIsEven(true));
    }

        @Test
    public void SquaredNumber(){
        Level4tasks squared = new Level4tasks();
        int expected = Level4tasks.squareOfANumber(4);
        int actual = 16;
        assertEquals(expected, actual);
    }


        @Test
    public void celsuisToFahrenheit(){
        Level4tasks temp = new Level4tasks();
        double expected = Level4tasks.celsuisToFahrenheit();
        double actual = 92.5;
        assertEquals(expected, actual);
   

}
}
