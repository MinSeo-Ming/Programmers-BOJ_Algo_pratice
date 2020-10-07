repeat = int(input())

for i in range(repeat):
    num = int(input())
    lists = list(map(int, input().split()))
    result = 0
    for j in lists:
        result += j
    print(result)