num = int(input())

list=[]
for i in range(num):
    list.append(int(input()))

list.sort()
for i in list:
    print(i)
