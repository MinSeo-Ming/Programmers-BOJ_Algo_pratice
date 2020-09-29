import sys
import math

number = int(sys.stdin.readline())
list = [[10], [1], [6, 2, 4, 8], [1, 3, 9, 7], [6, 4], [5], [6], [ 1, 7, 9, 3], [ 6, 8,4, 2], [1, 9]]

for i in range(number):
    a, b = sys.stdin.readline().split()
    b = int(b)
    a = int(str(a)[-1])
    idx = b % len(list[a])
    print(list[a][idx])

