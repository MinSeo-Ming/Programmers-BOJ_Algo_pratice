repeat = int(input())

result = 0
for i in range(repeat):
    need, have = map(int, input().split())
    remain = have % need
    result = result +remain

print(result)