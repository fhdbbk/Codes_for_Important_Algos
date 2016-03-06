from arraystack import ArrayStack

def opposite(c):
    if c == ']':
        return '['
    elif c == '}':
        return '{'
    elif c == ')':
        return '('
        
def checkBalance(st):
    stck = ArrayStack()
    for i in st:
        if i == '[' or i == '{' or i == '(':
            stck.push(i)
        else:
            if i == ']' or i == '}' or i == ')':
                if stck.isEmpty() or stck.peek() != opposite(i):
                    return False
                else:
                    stck.pop()
    if stck.isEmpty():
        return True
    return False
            
    
if __name__ == '__main__':
    st = "[A+(B*C)+{D/(1+A)}]"
    st2 = "]"
    st3 = "A+[D+(C+]"
    st4 = "[(])"
    print checkBalance(st)
    print checkBalance(st2)
    print checkBalance(st3)
    print checkBalance(st4)