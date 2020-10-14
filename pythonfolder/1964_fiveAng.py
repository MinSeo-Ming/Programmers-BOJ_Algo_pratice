num = int(input())

lists = [0, 5]
if num >1:
    for i in range(2, num+1):
        temp = 5* i -(2 * i -1)
        temp += lists[i-1]
        temp = temp % 45678
        lists.append(temp)

print(lists[num])
