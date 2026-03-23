import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class testingMethods{


        @Test
    public void sortingPrimeNumbers(){
    int[] number = {5,9,3,6,2};

    int[] expected = {2,3,5};
    int[] actual = Taskone.arrayOfNumbers(number);
    assertArrayEquals(expected, actual);
    } 

}
