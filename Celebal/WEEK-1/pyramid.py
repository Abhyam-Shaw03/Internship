print("\nPYRAMID PATTERN\n")

n = int(input("Enter a number: "))
for i in range(1, n + 1):
    # Printing spaces
    for j in range(n - i):
        print(" ", end=" ")
    # Printing stars
    for k in range(2 * i - 1):
        print("*", end=" ")
    print()

