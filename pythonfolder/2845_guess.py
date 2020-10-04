num , area =  map(int, input().split())

real_number  = num * area
list = list(map(int, input().split()))

for i in range(5):
    guess = list[i]
    list[i] =guess - real_number

for i in list:
    print(i , end=' ')
