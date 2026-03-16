import java.util.Scanner;

public class Taskten{

    public static void main(String...args){

    int average = 1;

    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter first number please:");
    int firstNumber = inputCollector.nextInt();

    System.out.println("Enter second number please:");
    int secondNumber = inputCollector.nextInt();

    System.out.println("Enter third number please:");
    int thirdNumber = inputCollector.nextInt();

    average = firstNumber + secondNumber + thirdNumber / 3;

    System.out.printf("the average of the three numbers is: " + average);

    }
}
