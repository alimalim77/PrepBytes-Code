import random
import string

# Generating Random Passwords
def generatePassword():
    characters = string.ascii_letters + string.digits + string.punctuation
    password = ''.join(random.choices(characters, k=20))
    return password 

print("Enter if you want to generate password:-")
while True:
    password =  generatePassword()
    print("Your password is: ",password)
    inp = input("Do you agree with password. Press Y or N - ")
    if inp == "Y":
        print("Password was changed!")
        break 

