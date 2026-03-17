public class Level4tasks{

    public static int addingTwoNumbers(int firstNumber, int secondNumber){

       return firstNumber + secondNumber;
           
    }

    
    public static boolean checkingIfANumberIsEven(boolean number){

        if(number % 2 == 0){
        
            return number;

        }
        
    }

    public static int squareOfANumber(int number){
        
            return number * number;
}


    public static double celsuisToFahrenheit(double celsuis){
        
        double fahrenheit = ((celsuis*9/5)+32);

            return fahrenheit;
    }
//
//
//    public static int ifANumberIsAPrimeNumber(int number){
//            primeNumber = 1;
//                if(number % 1 == 0)
//        
//        return number;
//    }
//
    public static double calculatingSimpleInterest(double principal, double rate, double time) {
        
        return (principal * rate * time)/100;
    }        

      
    

    
    public static int reversingANumber(int number){
        
        int reversed = 0;
        while (number != 0){
            int digits = digits % 10;
            reversed = reversed * 10 + digits;
            number /= 10;
    
            return reversed;
        }
    }

}
