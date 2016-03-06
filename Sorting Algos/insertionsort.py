def insertionSort(arr):
    n = len(arr)
    for j in range(1, n):
        key = arr[j]
        i = j - 1
        while i >= 0 and arr[i] > key:
            arr[i + 1] = arr[i]
            i -= 1
        arr[i + 1] = key
        
if __name__ == '__main__':
    arr = [5,58,12,11,7,34]
    print "Array before sorting:", arr
    insertionSort(arr)
    print "Array after sorting:", arr