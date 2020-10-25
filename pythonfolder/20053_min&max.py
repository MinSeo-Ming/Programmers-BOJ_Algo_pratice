repeat = int(input())
lists =[]

for i in range(repeat):
    num = int(input())
    line = list(map(int, input().split()))
    line.sort()
    lists.append(line)

for lines in lists:
    print(lines[0], lines[-1])

