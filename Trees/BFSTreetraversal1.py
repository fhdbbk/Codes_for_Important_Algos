class Node:
    def __init__(self, key):
        self.data = key
        self.left = None
        self.right = None
        
def height(node):
    if node is None:
        return 0
    lheight = height(node.left)
    rheight = height(node.right)
    
    return max(lheight, rheight) + 1
    
def printGivenLevel(root, level):
    if root is not None:
        if level == 1:
            print "%d" %(root.data),
        elif level > 1:
            printGivenLevel(root.left, level-1)
            printGivenLevel(root.right, level-1)

def printLevelOrder(root):
    h = height(root)
    print "Height of tree: %d" %(h)
    for i in range(1, h+1):
        printGivenLevel(root, i)
        
if __name__ == '__main__':
    root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left.left = Node(4)
    root.left.right = Node(5)
    printLevelOrder(root)