def find(ed, m, cakes):
    result = cakes[ed-1]-1
    minus = 0
    while result>0:
        for i in cakes:
            if i >= result:
                minus = minus+i-result

        if minus == m:
            print(result)
            break

        minus = 0
        result=result-1




n, m = map(int, input().split(' '))
cakes = list(map(int, input().split(' ')))
cakes.sort()
find(n, m, cakes)


# 4 6
# 19 15 10 17