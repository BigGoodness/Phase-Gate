from unittest import TestCase
import method

class TestForAddition(TestCase):
    def test_for_the_addition_of_two_numbers(self):
        actual = method.get_Addition_Of_Two_Numbers(2, 5)
        expected = 7
        self.assertEqual(expected, actual)
