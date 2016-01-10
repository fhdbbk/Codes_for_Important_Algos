dNumber = int(raw_input())
bNumber = ""

while True:
    q = dNumber / 2
    r = dNumber % 2
    bNumber = str(r) + bNumber
    dNumber = dNumber / 2
    if q == 0:
        break

print bNumber