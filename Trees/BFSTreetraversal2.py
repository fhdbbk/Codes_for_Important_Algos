class Node:
    def __init__(self, key):
        self.data = key
        self.left = None
        self.right = None
        
def printLevelOrder(root):
    if root:
        q = []
        q.append(root)
        while(len(q)) > 0:
            node = q.pop(0)
            print "%d" %(node.data),
            if node.left is not None:
                q.append(node.left)
            if node.right is not None:
                q.append(node.right)
                

if __name__ == '__main__':
    root = Node(1)
    root.left = Node(2)
    root.right = Node(3)
    root.left.left = Node(4)
    root.left.right = Node(5)
    printLevelOrder(root)   