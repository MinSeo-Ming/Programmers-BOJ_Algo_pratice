repeat = int(input())
sum = []
for i in range(repeat):
    result = int(input())
    op = int(input())
    if op != 0:
        for j in range(op):
            num, price = map(int, input().split())
            result += num * price
    sum.append(result)

for i in sum:
    print(i)