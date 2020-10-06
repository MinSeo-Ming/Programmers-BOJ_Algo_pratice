num = int(input())
grades = list(map(int, input().split()))

count = 0
result = 0

for i in grades:
    if i == 1:
        count += 1
    elif i == 0:
        count = 0
    result += count

print(result)