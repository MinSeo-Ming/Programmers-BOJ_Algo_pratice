n,m =map(int, input().split())
a,b, direct =map(int,input().split())

'방문한 위치 저장'
d = [[0]*m for _ in range(n)]

dir =list
for i in range(n+1):
    line = list(map(int,input().split()))
    dir.append(line)

visit = list

data =[(0,-1),(-1,0),(0,1),(1,0)]
count = 0
def count(a, b, direct):
    if direct == 0:
        direct =3
    else:
        direct -= 1
    visit.append((a, b))
    a += data[direct][0]
    b += data[direct][1]
    count += 1
    if dir[a][b] == 1:
        a -= data[direct][0]
        b -= data[direct][1]


