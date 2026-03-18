from unittest import TestCase
from arrays_Task


class TestForArrays(TestCase):
    def test_for_numbers_in_an_array(self):
        size = 5
        actual = arraysTask.numbers_in_an_array{10,11,12,5}
        expected = {10,11,12,-1,-1}
        assertEqual(actual, expected)
