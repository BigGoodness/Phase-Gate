import java.util.Scanner;

public class Taskeight{

    public static void main(String...args){

        int sum = 0;

        Scanner inputCollector = new Scanner(System.in);

        while(true){

        System.out.print("Enter numbers: ");
        int numberEntered = inputCollector.nextInt();

            if(numberEntered != 0){
                continue;
        }   else{

         sum += numberEntered;
        
    
            }
        System.out.println(sum);
            break;
        }

    }

}
