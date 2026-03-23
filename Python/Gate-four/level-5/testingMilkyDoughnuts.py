from unittest import TestCase
import milkydoughnuts



class TestForMilkyDoughnutsTasks(TestCase):
    def test_for_even_numbers(self):
        num = [2,3,4,5,6,7,8,9,10,11]
        actual = milkydoughnuts.countEvens(num)
        expected = 5
        self.assertEqual(actual, expected)

    def test_for_linearSearch(self):
        nums = [2,3,4,5,6,7,8,9,10,11]
        target = 7
        actual = milkydoughnuts.linearSearch(nums, target)
        expected = 5
        self.assertEqual(actual, expected)

    def test_for_squares(self):
        number = 5
        actual = milkydoughnuts.squares(number)
        expected = [1, 4, 9, 16, 25]
        self.assertEqual(actual, expected)

