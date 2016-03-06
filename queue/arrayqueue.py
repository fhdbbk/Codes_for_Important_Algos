class ArrayQueue:
    
    def __init__(self, cap):
        self.N = cap
        self.Q = [None] * self.N
        self.f = -1
        self.r = 0
        
    def size(self):
        return (self.N - self.f + self.r) % self.N
        
    def isEmpty(self):
        return (self.r == self.f or self.f == -1)
        
    def front(self):
        if self.isEmpty():
            raise Exception("Queue is empty!")
        return self.Q[self.f]
        
    def dequeue(self):
        if self.isEmpty():
            raise Exception("Queue is empty!")
        self.Q[self.f] = None
        self.f = (self.f + 1) % self.N
        
    def enqueue(self, elem):
        if self.size() == self.N - 1:
            raise Exception("Queue is full!")
        self.Q[self.r] = elem
        self.r = (self.r + 1) % self.N