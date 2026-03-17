import java.util.Scanner;

public class Tasksix{

    public static void main(String...args){

        Scanner inputCollector = new Scanner(System.in);

        System.out.println("Enter any number");
        int numberEntered = inputCollector.nextInt();

        for(int index = 1; index <= numberEntered; index++){

            System.out.println(index);

         }

     }

}
