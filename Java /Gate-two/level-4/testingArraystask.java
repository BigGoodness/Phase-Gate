import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class testingArraystask{


        @Test
    public void arraysTask(){
    int size = 5; 

    int actual = Daythree.Arraystask(10,11,12,5);

    int expected = (10,11,12,-1,-1);
    assertArrayEquals(actual, expected)
    }
}
