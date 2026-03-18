from unittest import TestCase
from arraysTask


class TestForArrays(TestCase):
    def test_for_numbers_in_an_array(self):
        actual = arraysTask.numbers_in_an_array{10,11,12}
        expected = {10,11,12,-1,-1}
        assertEqual(actual, expected)
