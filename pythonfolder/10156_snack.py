A, B, C = map(int, input().split())

need = A * B
if need > C:
    print(need - C)
else:
    print(0)
