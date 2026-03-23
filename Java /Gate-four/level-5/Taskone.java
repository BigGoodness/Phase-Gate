public class Taskone{

    public static int[] arrayOfNumbers(int[] numbers){
        
        for(int nums : numbers){

            if(nums <= 1){
                return nums;
            }

        for(int count = 2; count < nums; count++){

            if(nums % count == 0){

                return count;
            }
                
        }
           
    }


     return numbers;


        }



}
