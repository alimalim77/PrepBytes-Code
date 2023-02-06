def generate_prime_numbers(limit):
    """
    This function generates and prints the first `limit` prime numbers.
    """
    number = 2
    prime_count = 0
    while prime_count < limit:
        for divisor in range(2, number):
            if number % divisor == 0:
                break
        else:
            print(number)
            prime_count += 1
        number += 1

# Driver code
limit = 10

# Printing the first 10 prime numbers
print("The first 10 prime numbers are:")
generate_prime_numbers(limit)
