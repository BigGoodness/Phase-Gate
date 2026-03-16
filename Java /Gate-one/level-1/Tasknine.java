import java.util.Scanner;

public class Tasknine{

    public static void main(String...args){



    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter a price please:");
    double price = inputCollector.nextDouble();

    double tax = price * 10/100;

    System.out.printf("the price of the item is: " + price);

    }
}
