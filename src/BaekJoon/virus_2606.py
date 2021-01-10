from collections import deque

n = int(input())
l = int(input())
graph = [[] for _ in range(n+1)]

for i in range(l):
    x,y = map(int,input().split())
    graph[x].append(y)
    graph[y].append(x)

print(graph)
def bfs(x):
    queue = deque([x])
    visited[x] =True
    count =0
    while queue:
        x = queue.popleft()
        count+=1
        for i in graph[x]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True
    print(count-1)

visited =[False] *(n+1)

bfs(1)

