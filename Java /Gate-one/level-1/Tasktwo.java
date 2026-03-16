import java.util.Scanner;

public class Tasktwo{

    public static void main(String...args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter your age please:");
    int ageEntered = inputCollector.nextInt();

    int years = ageEntered * 2;

    System.out.printf("You will be " + years + "years old in 5 years");

    }
}
