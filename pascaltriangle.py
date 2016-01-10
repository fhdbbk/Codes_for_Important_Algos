#A Program to generate the Pascal's Triagle

# table: It stores the Pascal's Triangle in a 2D array

table = [[0 for i in range(1002)] for j in range(1002)]
for i in range(1002):
    table[0][i] = table[i][i] = 1
for i in range(2, 1002):
    for j in range(1, i):
        table[i][j] = (table[i-1][j-1] + table[i-1][j]) % (10 ** 9)


# Displays the values n+1C0 to n+1Cn+1
def display(arr, n):
    for i in range(1, n+2):
        print arr[i], 
    print