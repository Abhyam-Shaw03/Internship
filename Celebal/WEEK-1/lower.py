print("LOWER TRIANGULAR PATTERN\n")

n = int(input("Enter a number :"))
for i in range(0,n+1):
    for j in range(0,i):
        print('*',end=' ')
    print()
