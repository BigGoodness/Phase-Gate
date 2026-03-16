import java.util.Scanner;

public class Taskeight{

    public static void main(String...args){

    int square = 1;

    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter a number please:");
    int number = inputCollector.nextInt();

    square = number * number;

    System.out.printf("the square of the number is: " + square);

    }
}
