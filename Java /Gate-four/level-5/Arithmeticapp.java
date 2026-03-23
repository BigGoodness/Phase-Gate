//generate random subtraction problems and ensure result to the problem is never negative
//each problem is displayed sequentially
//user is allowed ten questions and for each question two attempts and if wrong another random question is generated with two attempts
//the score is calculated based on the number of correct answers the user has answered
//different random questions are generated for different users of the arithmeticapp





import java.util.Scanner;
import java.util.Random;

public class Arithmeticapp{

    public static void main(String...args){

    Random random = new Random();

    Scanner inputCollector = new Scanner(System.in);
    int finalScore = 0;


    for(int count = 0; count < 10; count++){
    int firstNumber = random.nextInt(10);
    int secondNumber = random.nextInt(10);

    char[] operators = {'+', '-', '*', '/'};
    char operator = operators[random.nextInt(3)];

    System.out.println(firstNumber + " " + operators + secondNumber + " = ");
    int answer = inputCollector.nextInt();

        int result;

        switch (operator){
            case '+':
            result = firstNumber + secondNumber;
            case '-':
            result = firstNumber - secondNumber;
            case '*':
            result = firstNumber * secondNumber;
            case '/':
            result = firstNumber - secondNumber;
            }
        if(answer < 0){
            System.out.println("No negative answer!");
        } else {
            
            System.out.println("Try again ! ! ");
               continue;
        }



    }

    

    
    }

}
