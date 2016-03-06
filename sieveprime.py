def genPrimeTable(n):
    pTable = [True] * (n+1)
    pTable[0] = pTable[1] = False
    import math
    m = int(math.sqrt(n))+1
    for i in range(2, m):
        if pTable[i]:
            j = 2
            while i*j <= n:
                pTable[i*j] = False
                j += 1
    return pTable

n = 36
primeTable = genPrimeTable(n)
for i in range(2, n+1):
    if primeTable[i]:
        print i, 