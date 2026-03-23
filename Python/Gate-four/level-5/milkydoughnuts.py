def countEvens(numbers):
    count = 0

    for number in numbers:
        if number % 2 == 0:
            count += 1

    return count


def linearSearch(numbers, target):

    for number in range(len(numbers)):
        if numbers[number] == target:
            return number

    return -1

def squares(number):
    result = []

    for numbers in range:
        result.append(numbers + 1) * (numbers + 1)

    return result
