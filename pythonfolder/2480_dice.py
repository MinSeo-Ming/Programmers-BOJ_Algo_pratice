list = []
A, B, C = map(int, input().split())

list.append(A)
list.append(B)
list.append(C)

list.sort()
result = 0
if list[0] == list[2]:
    result = 10000 + list[1] * 1000
elif list[0] == list[1] or list[1] == list[2]:
    result = 1000 + list[1] * 100
else:
    result = list[2] * 100
print(result)