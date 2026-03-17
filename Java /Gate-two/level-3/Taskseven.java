import java.util.Scanner;

public class Taskseven{

    public static void main(String...args){

        int sum = 0;

        Scanner inputCollector = new Scanner(System.in);

        for(int index = 1; index <= 5; index++){
    
        System.out.print("Enter five numbers: ");
        int numberEntered = inputCollector.nextInt();

            sum += numberEntered;

         }
        System.out.println(sum);

     }

}
