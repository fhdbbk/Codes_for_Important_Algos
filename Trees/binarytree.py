# Program for a Binary Tree
# Class representing the node of a Binary Tree

class Node:
    def __init__(self, key):
        self.data = key
        self.left = None
        self.right = None
        
def printInorder(root):
    if root:
        printInorder(root.left)
        print root.data,
        printInorder(root.right)
        
def printPreorder(root):
    if root:
        print root.data,
        printPreorder(root.left)
        printPreorder(root.right)
        
def printPostorder(root):
    if root:
        printPostorder(root.left)
        printPostorder(root.right)
        print root.data,
    
if __name__ == '__main__':
    root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left.left = Node(4)
    root.left.right = Node(5)
    printInorder(root)
    print
    printPreorder(root)
    print
    printPostorder(root)
    
#               1
#           /       \
#        /            \
#        2            3
#       /
#    /
#    4                