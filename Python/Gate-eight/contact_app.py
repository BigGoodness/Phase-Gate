contacts_list = []

def add_Contact(first_name, last_name, phone_number):
    first_name = input("Enter First Name: ")
    last_name = input("Enter Last Name: ")
    phone_number = int(input("Enter Phone: "))

    contacts_list.append(first_name, last_name, phone_number)
    return "Contact Added successfully!!!"


def remove_Contact(phone_number):
    for contact in contacts:
        if phone_number[contact] == contacts_list:
            contacts_list.remove(phone_number)
    return "Contact removed successfully!!"
    


def find_Contact_By_Phone_Number(phone_Number):
    for contact in contacts:
        if contact[phone_number] == contacts_list:
            return contacts_list[first_name], contacts_list[last_name]
    
