class DNode:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None
        
class DoublyLinkedList:
    
    def __init__(self):
        self.head = None
        
    def insertAtHead(self, d):
        temp = DNode(d)
        if self.head == None:
            self.head = temp
            return
        temp.next = self.head
        self.head.prev = temp
        self.head = temp
        
    def insertAtTail(self, d):
        temp1 = DNode(d)
        if self.head == None:
            self.head = temp1
            return
        temp2 = self.head
        while temp2.next != None:
            temp2 = temp2.next
        temp2.next = temp1
        temp1.prev = temp2
        
    def printList(self):
        if self.head == None:
            print "List is empty!"
            return
        temp = self.head
        while temp != None:
            print str(temp.data) + "-->",
            temp = temp.next
        print
        
    def printReverse(self):
        if self.head == None:
            print "List is empty!"
            return
        temp = self.head
        while temp.next != None:
            temp = temp.next
        while temp != None:
            print str(temp.data) + "-->",
            temp = temp.prev
        print
        
if __name__ == '__main__':
    dlist = DoublyLinkedList()
    dlist.insertAtHead(1)
    dlist.insertAtTail(2)
    dlist.insertAtTail(3)
    dlist.insertAtTail(4)
    dlist.printList()
    dlist.printReverse()
    