def sort_prime_numbers(number):
    numbers = []

    for numbs in number:  
        if numbs <= 1:
            continue

        count = 0
        for digit in range(2, numbs):
            if numbs % digit == 0:
                count += 1

        if count == 0:
            numbers.append(numbs)

    numbers.sort()
    return numbers

def replacing_negative_numbers(numbers):
        for index in range(len(numbers)):
            if numbers[index] < 0:
                numbers[index] = 0

        return numbers


def moving_zeros_to_the_end_of_the_array(numbers):
    number = []
    result = []

    for digits in numbers:
        if digits == 0:
            number.append(digits)
        else:
            result.append(digits)
    return result + number
print(moving_zeros_to_the_end_of_the_array([5,0,3,0,2,0]))
