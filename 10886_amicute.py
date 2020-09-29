import sys

number = int(sys.stdin.readline())
zero_cnt = 0
one_cnt = 0

for i in range(number):
    input_ = int(sys.stdin.readline())
    if input_ == 0:
        zero_cnt = zero_cnt + 1
    else:
        one_cnt = one_cnt + 1

if zero_cnt > one_cnt:
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")
