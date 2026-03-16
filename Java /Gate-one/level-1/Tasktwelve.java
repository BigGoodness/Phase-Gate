import java.util.Scanner;

public class Tasktwelve{

    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int number = inputCollector.nextInt();

        if (number < 0){
            
            System.out.println(number + " is a negative number");
        } else{
            System.out.println(number + " is a positive number");
}
            
    }
}
