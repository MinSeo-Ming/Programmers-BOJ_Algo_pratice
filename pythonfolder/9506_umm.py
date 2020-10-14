numbers = []
re =[]
while True:
    temp = int(input())
    if temp == -1:
        break
    numbers.append(temp)

for i in numbers:
    li = []
    for j in range(1,i):
        if i % j == 0:
            li.append(j)
    li.sort()
    te = set(li)
    li = list(te)
    re.append(li)

idx = 0
for i in re:
    result=0
    for j in i:
        result += j
    if result == numbers[idx]:
        temp = len(i)-1
        print(f'{numbers[idx]} = ', end='')
        for k in range(temp):
            print(i[k], end=" + ")
        print(i[-1])
    else:
        print(f'{numbers[idx]} is NOT perfect.')
    idx += 1

'''
import sys

myList = []
checkList = []
col = []
while True:
    a = int(sys.stdin.readline())
    if a == -1:
        break
    myList.append(a)

for item in myList:
    col = []
    for i in range(1,(item)):
        if (item % i) == 0:
            col.append(i)
    if sum(col) == item:
        print(str(item)+ ' = ' + ' + '.join(map(str,col)))
    else:
        print(str(item) + ' is NOT perfect.')
'''