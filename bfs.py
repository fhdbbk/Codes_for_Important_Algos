import sys

#Graph stored as an adjacency list.
G = [[1,2],
    [0],
    [0,3],
    [2,4,5],
    [3,5,6],
    [4,6,7],
    [4,5,7],
    [5,6]]

#Color for each node. White for non-visited nodes, grey for partially visited nodes and black for visited nodes.
color = [None] * len(G)
#Distance of each node from source node
d = [None] * len(G)
#Predecessor of each node.
p = [None] * len(G)
Q = []
def BFS(G, s, color, d, p):
    for i in range(len(G)):
        if i == s:
            continue
        else:
            color[i] = 'W'
            d[i] = sys.maxint
            p[i] = None
    color[s] = 'G'
    d[s] = 0
    p[s] = None
    Q = []
    Q.append(s)
    while len(Q) > 0:
        u = Q.pop(0)
        for v in G[u]:
            if color[v] == 'W':
                color[v] = 'G'
                d[v] = d[u] + 1
                p[v] = u
                Q.append(v)
        color[u] = 'B'
        
def print_path(G, s, v, p):
    if v == s:
        print str(s) + "-->",
    elif p[v] == None:
        print "No path exists from Node", s, "to Node", v
    else:
        print_path(G, s, p[v], p)
        print str(v) + "-->", 

BFS(G, 2, color,d, p)
print(d)
print_path(G, 2, 6, p)
