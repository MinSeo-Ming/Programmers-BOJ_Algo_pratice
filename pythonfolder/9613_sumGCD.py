import sys

num = int(sys.stdin.readline())

def gcd(first, second):
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


for i in range(num):
    line = list(map(int, input().split()))
    count = line[0]
    result = 0
    for j in range(1, count):
        first = line[j]
        for k in range(j + 1, count + 1):
            second = line[k]
            result += gcd(first, second)
    print(result)
