loop = int(input())
list = []

for i in range(loop):
    line = []
    a,b = input().split()
    a = int(a)
    b = int(b)
    line.append(a)
    line.append(b)
    list.append(line)

def gcd( first, second):
    min = second
    max = first
    if first <= second:
        min = first
        max = second
    while min != 0:
        temp = max % min
        max = min
        min = temp

    return max

def lcd(first, second):
    min = gcd(first,second)
    a = first/min
    b = second/min
    result = min * a *b
    return int(result)


for i in range(loop):
    print(lcd(list[i][0],list[i][1]))
