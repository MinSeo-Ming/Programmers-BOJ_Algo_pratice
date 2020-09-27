num = input()

list = []
num = int(num)

for i in range(num):
    temp = input()
    list.append(temp)

for i in range(num):
    str = list[i]
    check = str.find(' ')
    print("Case #%d: " % (i + 1), end='')
    if check != -1:
        temp = str.split(' ')
        length = len(temp)
        for j in reversed(range(length)):
            print(temp[j]+" ", end='')
    else:
        print(str, end='')
    print()

