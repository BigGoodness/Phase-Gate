#def numbers_in_an_array(length_of_nums):
#    list_of_numbers = []
#        while length_of_nums > list_of_numbers:
#            list_of_numbers.append[-2]
#    return list_of_numbers
#numbers_in_an_array()
#
#

def letters_and_numbers(size):
    result = " "
    count = 1

    for number in range(len(size)):
        if size[number == size[number - 1]]:
            count += 1
        else:
            result += size[number-1] + str[count]
            count = 1
    result += size[-1] + str[count]
    return result

print(letters_and_numbers("AaaBBc"))
print(letters_and_numbers("EEEEnnnneee"))
print(letters_and_numbers("ooooooYOO"))


#def two_d_array_in_arrays()
