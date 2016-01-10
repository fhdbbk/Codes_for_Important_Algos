def genPrimeTable(n):
    pTable = [True] * (n+1)
    pTable[0] = pTable[1] = False
    import math
    m = int(math.sqrt(n))+1
    for j in range(2, m + 1):
        if pTable[j]:
            for k in range(j*j, n+1, j):
                pTable[k] = False
    return pTable

n = 36
primeTable = genPrimeTable(n)
for i in range(2, n+1):
    if primeTable[i]:
        print i, 