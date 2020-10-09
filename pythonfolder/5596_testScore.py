min = list(map(int, input().split()))
man = list(map(int, input().split()))

result_min = 0
for i in min:
    result_min += i
result_man = 0
for i in man:
    result_man += i

if result_min >= result_man:
    print(result_min)
else:
    print(result_man)