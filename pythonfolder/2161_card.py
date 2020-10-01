num = int(input())

list = []
result =[]
for i in range(num):
    input_ = i+1
    list.append(input_)

while len(list) > 1:
    input_ = list.pop(0)
    result.append(input_)
    temp = list.pop(0)
    list.append(temp)

for i in result:
    print(i ,end='')
    print(" " ,end='')

print(list[0])
