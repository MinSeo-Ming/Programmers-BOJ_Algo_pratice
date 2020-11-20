import math
import sys
number = int(sys.stdin.readline())


sq = int(math.sqrt(number))

count = 1
temp = int(math.pow(sq, 2))
remain = number-temp
sq = sq-1

while True:
    if remain == 0:
        break
    else:
        temp = int(math.pow(sq, 2))
        if temp > remain:
            sq = sq - 1
            continue
        else:
            remain = remain - temp
            count = count+1

print(count)
