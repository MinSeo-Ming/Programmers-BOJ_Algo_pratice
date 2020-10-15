num = int(input())

for i in range(num):
    str1, str2 = input().split()
    leng = len(str1)
    print("Distances: ", end='')
    for j in range(leng):
        c1 = str2[j]
        c0 = str1[j]
        temp = ord(c1) - ord(c0)
        if temp < 0:
            temp += 26
        print(temp,end=' ')
    print()