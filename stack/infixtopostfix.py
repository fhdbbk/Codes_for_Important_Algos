from arraystack import ArrayStack

def prec(ch):
    if ch == '-' or ch == '+':
        return 1
    elif ch == '*' or ch == '/' or ch == '%':
        return 2
    elif ch == '^':
        return 3
        
def isOperand(ch):
    return (ord(ch) >= ord('a') and ord(ch) <= ord('z')) or (ord(ch) >= ord('A') and ord(ch) <= ord('Z'))
    
def infixToPostfix(exp):
    stck = ArrayStack()
    postfix = ""
    for i in range(len(exp)):
        if isOperand(exp[i]):
            postfix += exp[i]
        else:
            if stck.isEmpty():
                stck.push(exp[i])
            else:
                if prec(exp[i]) >= prec(stck.peek()):
                    stck.push(exp[i])
                else:
                    while not stck.isEmpty() and prec(exp[i]) < prec(stck.peek()):
                        postfix += stck.pop()
                    stck.push(exp[i])
        #print "Stack:", stck.printStack(), "Expression:", postfix
    while not stck.isEmpty():
        postfix += stck.pop()
    return postfix

if __name__ == '__main__':
    exp = 'a+b*c+d'
    print infixToPostfix(exp)