#Code for generating all the permutations of a string

def swap(a, l, r):
    a[l], a[r] = a[r], a[l]
    
    
def toString(a):
    return ''.join(a)
    
def permute(a, l, r):
    if l == r:
        print toString(a)
    else:
        for i in range(l, r+1):
            swap(a, l, i)
            permute(a, l+1, r)
            swap(a, l, i)      #Backtracing to get the previous permutation
            
            
if __name__ == '__main__':
    st = "ABCD"
    n = len(st)
    a = list(st)
    print a
    permute(a, 0, n-1)