public class Miniparkingsystem{
    
            int[] parkingSlots = new int[20];

    public static void initializeParking(){
        for(int index = 0; index <= 19; index++){
                parkingSlots[index] = 0;
            
        }

    }

    public static int parkCar(){

        for(int count = 0; count <= 19; count++){
            if (parkingSlots[count] == 0){
                parkingSlots[count] = 1
            System.out.println("Car parked at slot " + (count + 1));
                return count;

            }

        }  
                System.out.println("Parking is full");
    }




    public static int unparkCar(int slotNumber){
    
        if (slotNumber < 1 || slotNumber > 20){
            System.out.println("slotNumber is invalid");
                return slotNumber;
        }
        if(parkingSlots[slotNumber - 1] == 1){
        parkingSlots[slotNumber - 1] = 0
        System.out.println("Car removed from slot " + slotNumber)
        }
       else{
        System.out.println("Slot already empty");
        }
    }

}


































//        while (true):
//        String menu = """
//
//        1. Park Car
//        2. Unpark Car
//        3. Display Parking Status
//        4. Exit
//
//        """;
//        System.out.println(menu);


