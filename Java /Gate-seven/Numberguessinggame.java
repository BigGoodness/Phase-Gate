import java.util.Random;
import java.util.Scanner; 


public class Numberguessinggame{
    static int secretNumber = random.nextInt(1, 100);
    static int attempts = 0;
    static int maxAttempts = 5;
    static boolean guessedCorrectly = false;

    public static void main(String...args){

        Scanner inputCollector = new Scanner(System.in);
        System.out.println("Welcome to the Guessing game app");

        System.out.println("Guess a number between 1 and 100: ");
        int guessedNumber = inputCollector.nextInt();
    
          while (attempts < maxAttempts && guessedCorrectly == false){
            System.out.println("Enter your guess: ");
            int guess = inputCollector.nextInt();

            if (guessed < 1 || guessed > 100){
                System.out.println("Number must be between 1 and 100");
            }
                attempts++;
                if(guessed == secretNumber){
                System.out.println("You have correctly guessed the number");

                    } else if(guess < secretNumber){
                        System.out.println("Your Guess Is Too Low");
                    } else(guess > secretNumber){
                        System.out.println("Your Guess Is Too High");
                    }

            }
            }

        }

    }

  

}
