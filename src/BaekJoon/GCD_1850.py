a,b = map(int,input().split())


def gcd(a,b):
    if b==0:
        return a
    else:
        return gcd(b,a%b)
if a>b:
    temp = gcd(a,b)
else:
    temp = gcd(b, a)

while temp >0:
    print(1,end='')
    temp -=1

print()



