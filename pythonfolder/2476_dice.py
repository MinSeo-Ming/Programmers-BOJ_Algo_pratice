repeat = int(input())
max = []

for i in range(repeat):
    num = list(map(int, input().split()))
    num.sort()

    if num[0] == num[2]:
        result = 10000+num[1]*1000
    elif num[0] == num[1] or num[1] == num[2]:
        result = 1000 + num[1]*100
    else:
        result = num[2]*100
    max.append(result)

max.sort()
print(max[-1])