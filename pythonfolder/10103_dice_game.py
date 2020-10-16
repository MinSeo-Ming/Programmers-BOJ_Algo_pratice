repeat = int(input())

score =[100, 100]

for i in range(repeat):
    a, b =map(int,input().split())
    if a > b:
        score[1] -= a
    elif b > a :
        score[0] -= b

for i in score:
    print(i)