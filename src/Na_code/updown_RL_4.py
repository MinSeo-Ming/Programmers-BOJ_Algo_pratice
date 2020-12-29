n = int(input())
data = input().split()
x, y = 1, 1

for c in data:
    if c == 'R':
        if y < n:
            y += 1
    elif c == 'L':
        if y > 1:
            y -= 1
    elif c == 'U':
        if x > 1:
            x -= 1
    elif c == 'D':
        if x < n:
            x += 1

print(x, y)


