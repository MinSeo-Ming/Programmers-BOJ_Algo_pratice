repeat = int(input())

for i in range(repeat):
    line = list(map(int, input().split()))
    line_odd =[]
    for j in line:
        if j % 2 == 0:
            line_odd.append(j)

    line_odd.sort()
    result = 0
    for j in line_odd:
        result += j
    print(result, line_odd[0])
