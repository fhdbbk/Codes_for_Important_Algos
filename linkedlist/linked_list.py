class Node:
        
    def __init__(self, d):
        self.data = d
        self.next = None
        
class LinkedList:
    
    def __init__(self):
        self.head = None
    
    def getHead(self):
        return self.head
        
    #Inserts at the end of the list        
    def insert(self, d):
        temp1 = Node(d)
        if self.head == None:
            self.head = temp1
            return
        temp2 = self.head
        while temp2.next != None:
            temp2 = temp2.next
        temp2.next = temp1
        
    #Inserts at the given position
    def insertAtPosition(self, d, position):
        temp1 = Node(d)
        if position == 1:
            temp1.next = self.head
            self.head = temp1
            return
        temp2 = self.head
        for i in range(1,position -1):
            temp2 = temp2.next
        temp1.next = temp2.next
        temp2.next = temp1
        
    #Prints the list
    def printList(self):
        if self.head == None:
            print "List is Empty!"
            return
        temp = self.head
        while temp:
            print str(temp.data) + "->",
            temp = temp.next
        print
        
    #Prints the list using recursion    
    def printListRecursive(self, p):
        if p == None:
            print
            return
        print str(p.data) + "->",
        self.printListRecursive(p.next)
    
    #Prints  the list in reverse order
    def printReverse(self, p):
        if p == None:
            return
        self.printReverse(p.next)
        print str(p.data) + "->",
    
    def listSize(self):
        if self.head == None:
            return 0
        temp = self.head
        count = 0
        while temp:
            count += 1
            temp = temp.next
        return count
        
    #Deletes a node at a given position
    def deleteNode(self, position):
        if position > self.listSize():
            print "Invalid operation"
            return
        if position == 1:
            self.head = self.head.next
            return
        temp = self.head
        for i in range(1, position - 1):
            temp = temp.next
        temp.next = temp.next.next
        
    def reverseList(self):
        prevNode = None
        nextNode = None
        current = self.head
        while(current != None):
            nextNode = current.next
            current.next = prevNode
            prevNode = current
            current = nextNode
        self.head = prevNode
    
    #Reverses the list using recursion
    def reverseListRecursive(self, p):
        if p.next == None:
            self.head = p
            return
        self.reverseListRecursive(p.next)
        q = p.next
        q.next = p
        p.next = None        
        
if __name__ == '__main__':
    lst = LinkedList()
    lst.insert(5)
    lst.printList()
    lst.insert(56)
    lst.printList()
    lst.insert(41)
    lst.printList()
    lst.insertAtPosition(1, 1)
    lst.printList()
    lst.insertAtPosition(22, 3)
    lst.printList()
    lst.insertAtPosition(82, 6)
    lst.printList()
    print "Size of the list is: " + str(lst.listSize())
    #lst.deleteNode(4)
    #lst.printList()
    #lst.deleteNode(1)
    #lst.printList()
    #lst.deleteNode(4)
    #lst.printList()
    #lst.deleteNode(4)
    #lst.printList()
    #print "Size of the list is: " + str(lst.listSize())
    lst.reverseList()
    h = lst.getHead()
    lst.printListRecursive(h)
    lst.printReverse(h)
    lst.reverseListRecursive(h)
    print
    lst.printList()