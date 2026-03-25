import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Testingnumberguessinggame{



        @Test
    public void testGuessIsTooHigh(){
    assertEquals(Numberguessinggame.validatingUserInput(50, 90));
    }


        @Test
    public void testGuessIsTooLow(){
    assertEquals(Numberguessingapp.validatingUserInput(50, 30));
    }


        @Test
    public void testGuessIsOkay(){
    assertEquals(Numberguessingapp.validatingUserInput(50, 50));
}
}
