def genSets(universe, s):
    for i in range(len(universe)):
        subS = s[:]
        for x in s:
            temp = x[:]
            if universe[i] not in temp:
                temp.append(universe[i])
            subS.append(temp)
        s = subS[:]
    return s
        
        
        


universe = ['a','b']
s = [[]]
print genSets(universe, s)