class ArrayStack:
    
    def __init__(self):
        self.stack = []
        
    def isEmpty(self):
        return len(self.stack) == 0
        
    def peek(self):
        return self.stack[len(self.stack) - 1]
        
    def push(self, elem):
        self.stack.append(elem)
        
    def pop(self):
        if self.isEmpty():
            print "Stack Empty"
            return
        return self.stack.pop()
        
    def printStack(self):
        print self.stack
        
if __name__ == '__main__':
    mystack = ArrayStack()
    mystack.printStack()
    mystack.push(12)
    mystack.push(50)
    mystack.printStack()
    mystack.pop()
    mystack.printStack()
    mystack.pop()
    mystack.printStack()
    mystack.pop()