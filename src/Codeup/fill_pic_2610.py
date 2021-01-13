graph =[]
for _ in range(10):
    graph.append(list(input()))
y,x = map(int, input().split())

def dfs(x,y):
    if x<=-1 or y<=-1 or y>=10 or x>=10:
        return False
    if graph[x][y] == '_':
        graph[x][y]='*'
        dfs(x-1,y)
        dfs(x+1,y)
        dfs(x,y-1)
        dfs(x,y+1)
        return True
    return False

dfs(x,y)

for line in graph:
    print(''.join(line))
