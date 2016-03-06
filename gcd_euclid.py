def gcdEuclid(a,b):
    if b == 0:
        return a
    return gcdEuclid(b, a % b)
    
if __name__ == '__main__':
    a = 350
    b = 105
    print gcdEuclid(a, b)