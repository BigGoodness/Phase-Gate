import java.util.Scanner;

public class Taskthree{

    public static void main(String...args){

    int sum = 0;

    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter first number please:");
    int firstNumber = inputCollector.nextInt();

    System.out.println("Enter second number please:");
    int secondNumber = inputCollector.nextInt();

    sum = firstNumber + secondNumber;

    System.out.printf("the sum of the two numbers is: " + sum);

    }
}
