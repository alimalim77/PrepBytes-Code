import random
import string

# Generating Random Passwords
def generatePassword(n):
    characters = string.ascii_letters + string.digits + string.punctuation
    password = ''.join(random.choices(characters, k=n))
    return password 

print("Enter the length of password you want to generate:-")
while True:
    password =  generatePassword(int(input()))
    print("Your password is: ",password)
    inp = input("Do you agree with password. Press Y or N - ")
    if inp == "Y":
        print("Password was changed!")
        break 

