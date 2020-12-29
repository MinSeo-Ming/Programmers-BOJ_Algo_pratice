n, k = map(int, input().split())
cnt=0
while(n != 1):
    cnt= cnt+1
    if n % k == 0:
        n=n//k
    else :
        n = n-1
print(cnt)
"""
책에 있는 정답

while n >=k:
    while n%k !=0:
        n-=1
        cnt +=1
    n//k
    cnt+=1
while n>1:
    n-=1
    cnt +=1
print(cnt)
"""
