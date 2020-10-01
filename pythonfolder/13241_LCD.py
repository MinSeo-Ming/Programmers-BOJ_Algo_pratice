first, second = map(int,input().split())

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

def lcd (first, second):
    min = gcd(first, second)
    a = first/min
    b = second/min
    result = min * a * b
    print(int(result))

lcd(first, second)
