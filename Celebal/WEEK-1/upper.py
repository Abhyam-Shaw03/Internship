print("\nUPPER TRIANGULAR PATTERN\n")

n = int(input("Enter a number: "))
for i in range(n,0,-1):
    #printing of spaces
    for j in range(0,n-i):
        print(' ',end=' ')
    #printing of stars
    for k in range(i,0,-1):
        print('*',end=' ')
    print()


