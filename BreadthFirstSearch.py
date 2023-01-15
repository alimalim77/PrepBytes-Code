from collections import deque
def bfs(graph, source,stack,visited):
    visited.add(source)
    q = deque([source])
    while q:
        cur = q.popleft()
        for i in graph[cur]:
            if i not in visited:
                visited.add(i)
                q.append(i)
        print(cur)

    return True
            

graph = {
    'a':['b','e'],
    'b':['a','c'],
    'c':['b','e','d'],
    'd':['c','e'],
    'e':['a','e','d'],

}
print(bfs(graph,'a',['a'],set()))