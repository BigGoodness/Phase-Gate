import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestingArrayWarmup{


    public void testArrays(){
    int expected = Warmup.Arrays();
    int actual = [9,2,3,2,1];
    assertEquals(expected, actual);
    }
}
