first ,second  = input().split()
first = int(first)
second = int(second)

min =0
max =0

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

def lcd(first, second, min):
    a = first/min
    b = second/min
    result = min * a *b
    return int(result)

min = gcd(first,second)
max = lcd(first,second,min)
print(min)
print(max)

