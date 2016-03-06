import math
#Generates prime factors as a list of tuples (x,y) where x is the prime factor
#and y is its frequency
 
def generatePrimeFactors(n):
    primeFactors = []
    i = 2
    while i <= math.sqrt(n):
        #print i
        if n % i == 0:
            count = 0
            while n % i == 0:
                n = n/i
                count += 1
            primeFactors.append(tuple([i,count]))
        i += 1
    if n != 1:
        primeFactors.append(tuple([n, 1]))
        
    return primeFactors
    
if __name__ == '__main__':
    n = 36
    print generatePrimeFactors(n)