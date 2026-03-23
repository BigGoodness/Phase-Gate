import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;



public class Testingmilkydoughnuts{
        @Test
    public void testForElementsThatAreEven(){
        int[] number = {2,3,4,5,6,7,8,9,10,11};

        int expected = 5;
        int actual = Milkydoughnutstasks.countEvens(number);
        assertEquals(expected, actual);
    }

        @Test
  public void testForTargetingElementsInAnArray(){
        int[] digit = {2,3,4,5,6,7,8,9,10,11};
        int target = 7;
        int expected = 5;
        int actual = Milkydoughnutstasks.linearSearch(digit, target);
        assertEquals(expected, actual);
    }


        @Test
  public void testForPerfectSquaresInAnArray(){
     int number = 5;
     int expected[] = {1, 4, 9, 16, 25};
     int actual [] = Milkydoughnutstasks.squares(number);
     assertArrayEquals(expected, actual);
    }


}
