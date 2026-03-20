from unittest import TestCase
import getting_prime_numbers



class TestForPrimeNumbers(TestCase):
    def test_for_prime_numbers(self):

        num = [5,9,3,6,2]
        actual = getting_prime_numbers.sort_prime_numbers(num)
        expected = [2,3,5]
        self.assertEqual(expected, actual)

    def testForReplacing_Negatives(self):

        digits = [5,-9,3,-6,2,-11]
        actual = getting_prime_numbers.replacing_negative_numbers(digits)
        expected = [5,0,3,0,2,0]
        self.assertEqual(expected, actual)


    def testForMovingZerosToTheEndOfTheArray(self):

        digits = [5,0,3,0,2,0]
        actual = getting_prime_numbers.moving_zeros_to_the_end_of_the_array(digits)
        expected = [5,3,2,0,0,0]
        self.assertEqual(expected, actual)
