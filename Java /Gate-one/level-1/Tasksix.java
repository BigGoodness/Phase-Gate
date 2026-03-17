import java.util.Scanner;

public class Tasksix{

    public static void main(String...args){

    Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter the radius of a circle: ");
        double radius = inputCollector.nextDouble();

        double circumferenceOfACircle = 3.14 * radius * radius;

        System.out.printf("the circumference of a circle is: " + circumferenceOfACircle);
    }
}
