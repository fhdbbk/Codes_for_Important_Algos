import math
def generateFactors(n):
    factors = []
    m = int(math.sqrt(n)) + 1
    for i in range(1, m+1):
        if n % i == 0:
            factors.append(i)
            if i != (n/i):
                factors.append(n/i)
    return factors
    
if __name__ == '__main__':
    n = 36
    factors = generateFactors(n)
    factors.sort()
    print factors