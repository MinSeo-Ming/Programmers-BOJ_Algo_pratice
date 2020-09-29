import sys
import math

start = int(sys.stdin.readline())
end = int(sys.stdin.readline())

st = int(math.sqrt(start))
check = int(math.pow(st, 2))

if check < start:
    st = st+1
ed = int(math.sqrt(end))+1

result = 0

if st == ed:
    print("-1")
else:
    for i in range(st, ed):
        result = result + int(math.pow(i, 2))
    print(result)
    print(int(math.pow(st, 2)))
