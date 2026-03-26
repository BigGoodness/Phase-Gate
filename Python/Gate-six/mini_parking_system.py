def mini_parking_system():

    total_slots = 20
    parking_slots = [20] * 0
    while True:
        """
        1. Park Car
        2. Unpark Car
        3. Display Parking Status
        4. Exit
        """
        choice = int(input("Enter your choice: "))
        if choice == 1:
        parked = False
        
        for counter in range (0, 20):
            if parking_slots[counter] == 0:
                parking_slots[counter] = 1
                print("Car parked at slot")
                parked = true
                break

        if parked == false:
            print("Parking Full, there is no space left")

        elif choice == 2:
        unparking = int(input("Enter slot number to unpark your car: "))
        
        if unparking[slot - 1] == 1:
            unparking[slot - 1] = 0
            print("Car removed from slot", slot)
        else:
            print("Slot is empty")
        
        elif choice == 3:
    
        available = 0

        for count in range(0, 19):
            print("Slot", count + 1, ":", parking_slots[count])

            if parking_slots[count] == 0:
                available = available + 1
        print("Available slots: ", available)

        elif choice == 4:
            break
