#Code for Longest Increasing Subsequence(LIS) using Dynamic Programming

def lis(arr):
    
    n = len(arr)
    liss = [1] * n
    
    for i in range(1, n):
        for j in range(0, i):
            if arr[i] > arr[j] and liss[i] < liss[j] + 1:
                liss[i] = liss[j] + 1
                
    maximum = 0
    for i in range(0, n):
        maximum = max(maximum, liss[i])
        
    return maximum
    
if __name__ == '__main__':
    arr = [10,22,9,33,21,50,41,60]
    print lis(arr)