repeat =int(input())
list = []

for i in range(repeat):
    temp = int(input())
    temp = format(temp,'b')
    temp = temp[::-1]
    list.append(temp)

target = '1'
index = -1

for i in list:
    while True:
        index = i.find(target, index + 1)
        if index == -1:
            break
        print(index, end=' ')
    print()
