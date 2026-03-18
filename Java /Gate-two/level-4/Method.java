public class Method{

    public static int additionOfTwoNumbers(int firstNumber, int secondNumber){
        
        return firstNumber + secondNumber;
    }

    public static boolean primeNumbers(int number){
        
            if(number < 1){

                return false;
            }   
        for(int index = 2; index < number; index++){
            
                if (number % index == 0){
                    return false;
                }
                
        }
            return true;

    }

    public static int squareOfANumber(int number){
        
        return number * number;
    }

}

