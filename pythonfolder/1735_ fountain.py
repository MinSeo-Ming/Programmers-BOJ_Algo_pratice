import sys

a, b = sys.stdin.readline().split()
c, d = sys.stdin.readline().split()

a = int(a)
b = int(b)
c = int(c)
d = int(d)

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


down = lcd(b,d)
up_1 = int(down/b * a)
up_2 = int(down/d * c)
up = up_1 + up_2


check = gcd(up, down)
if check != 1:
    up = up/check
    gcd = gcd/check

print(up_1+ up_2, down)
