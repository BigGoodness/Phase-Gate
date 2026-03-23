public class Milkydoughnutstasks{


    public static int countEvens(int[] numbers){
            int count = 0;

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] % 2 == 0){
                count++;
            }

        }
            return count;

    }



    public static int linearSearch(int[] numbers, int target){
        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] == target){
                return index;
            }
            
        }
            return -1;
    
    }


    public static int[] squares(int number){
        int []result = new int[number];
        
        for(int index = 0; index < number; index++){
            result[index] = (index + 1) * (index + 1);

        }

    
            return result;
}
}
