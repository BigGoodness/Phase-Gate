from unittest import TestCase
import contact_app


class testingContact(TestCase):
    def test_for_adding_contacts(self):
        firstName = "John"
        lastName = "Doe"
        phoneNumber = "08012345678"
        actual = contact_app.add_Contact(firstName, lastName, phoneNumber)
        expected = "Contact Added successfully!!!"

        self.assertEqual(actual,expected)

    def test_for_removing_contacts(self):
        firstName = "John"
        lastName = "Doe"
        phoneNumber = "08012345678"
        actual = contact_app.remove_Contact(phoneNumber)
        expected = "Contact removed successfully!!"

        self.assertEqual(actual,expected)
    
