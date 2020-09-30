import sys
input = sys.stdin.readline
num = int(input())
list = []
for i in range(num):
    n = int(input())
    list.append(n)

max = list[-1]
count = 1
for i in reversed(list):
    if i > max:
        count = count +1
        max = i

print(count)



