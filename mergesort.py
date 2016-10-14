def merge(B, C):
    A = []
    i = 0
    j = 0
    while i < len(B) and j < len(C):
        if B[i] <= C[j]:
            A.append(B[i])
            i += 1
        else:
            A.append(C[j])
            j += 1
    while i < len(B):
        A.append(B[i])
        i += 1
    while j < len(C):
        A.append(C[j])
        j += 1
    return A

def merge_sort(A):
    if len(A) == 1:
        return A
    m = len(A)/2
    B = merge_sort(A[:m])
    C = merge_sort(A[m:])
    A = merge(B, C)
    return A

if __name__ == '__main__':
    A = [7, 2, 5, 3, 7, 13, 1, 6]
    A = merge_sort(A)
    print A
