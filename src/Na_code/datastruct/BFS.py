from collections import deque

def bfs(graph, start, visited):
    queue = deque([start])
    #현재 노드 방문처리
    visited[start] =True
    while queue:
        v = queue.popleft()
        print(v, end=' ')
        for i in graph[v]:
            if not visited[i]:
                queue.append(i)
                visited[i]=True

graph = [
    [],
    [2,3,8],
    [1,7],
    [1,4,5],
    [3,5],
    [3,4],
    [7],
    [2,6,8],
    [1,7]
]
visited =[False]*9
print("정점 1 부터 탐색 ",end=' ')
bfs(graph,1,visited)
print()
print("정점 2 부터 탐색 ",end=' ')
visited =[False]*9
bfs(graph,2,visited)
print()
print("정점 3 부터 탐색 ",end=' ')
visited =[False]*9
bfs(graph,3,visited)
print()
print("정점 4 부터 탐색 ",end=' ')
visited =[False]*9
bfs(graph,4,visited)
print()
print("정점 5 부터 탐색 ",end=' ')

visited =[False]*9
bfs(graph,5,visited)
print()
print("정점 6 부터 탐색 ",end=' ')
visited =[False]*9
bfs(graph,6,visited)
print()
print("정점 7 부터 탐색 ",end=' ')
visited =[False]*9
bfs(graph,7,visited)
print()
print("정점 8 부터 탐색 ",end=' ')
visited =[False]*9
bfs(graph,8,visited)
print()