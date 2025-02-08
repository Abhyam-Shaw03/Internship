# ADD Function
def add(num1, num2):
	return num1 + num2

# DIVIDE Function
def divide(num1, num2):
	return num1 / num2

# MULTIPLY Function
def multiply(num1, num2):
	return num1 * num2

# SUBTRACT Function
def subtract(num1, num2):
	return num1 - num2

print("Operation List:\n1. ADD\n2. MULTIPLY\n3. SUBTRACT\n4. DIVIDE\n")
		
# User Input
opt = int(input("Select operations from 1, 2, 3, 4 :"))

num1 = int(input("Enter 1st number: "))
num2 = int(input("Enter 2nd number: "))

if opt == 1:
	print(num1, "+", num2, "=",
					add(num1, num2))

elif opt == 2:
	print(num1, "*", num2, "=",
					multiply(num1, num2))

elif opt == 3:
	print(num1, "-", num2, "=",
					subtract(num1, num2))

elif opt == 4:
	print(num1, "/", num2, "=",
					divide(num1, num2))
else:
	print("Invalid input")