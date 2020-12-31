n = int(input())

result =0

for i in range(n+1):
    for m in range(60):
        for s in range(60):
            if'3' in str(i) + str(m)+ str(s):
                result += 1


print(result)