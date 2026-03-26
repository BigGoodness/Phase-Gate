first_name_contacts_list = []
last_name_contacts_list = []
phone_number_contacts_list = []

def add_Contact(first_name, last_name, phone_number):

    first_name_contacts_list.append(first_name)
    last_name_contacts_list.append(last_name)
    phone_number_contacts_list.append(phone_number)
    return "Contact Added successfully!!!"


def remove_Contact(phone_number):
    for contact in phone_number_contacts_list:
        if contact == phone_number_contacts_list:
            contacts_list.remove(phone_number)
    return "Contact removed successfully!!"
    


#def find_Contact_By_Phone_Number(phone_Number):
#    for contact in contacts:
#        if contact[phone_number] == contacts_list:
#            return first_name_contacts_list[first_name], last_name_contacts_list[last_name]
#            return contact[phone_number]
#
#
#def find_contact_by_first_name(first_name_contacts_list):
#    for contact in contacts:
#        if contact[first_name_contacts_list] == first_name_contacts_list:
#            return contact[first_name_contacts_list], contact[last_name_contacts_list], "-" contact[phone_number_contacts_list]
#
#
#def editContact(phone_number_contacts_list):
