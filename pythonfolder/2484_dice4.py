repeat = int(input())

max = 0
for i in range(repeat):
    lines = list(map(int, input().split()))
    lines.sort()
    result =0
    if lines [0] == lines[3]:
        result = 50000 + lines[0]*5000
    elif lines[0] == lines[2] or lines[1] == lines[3]:
        result = 10000 + lines[1]*1000
    elif lines[0] == lines[1] and lines[2] == lines[3]:
        result = 2000 + 500 * lines[2] + lines[1]*500
    elif lines[2] == lines[3] or lines[1] == lines[2]:
        result = 1000 + lines[2]*100
    elif lines[0] == lines[1]:
        result = 1000 + lines[1]*100
    else:
        result = lines[3]*100

    if max < result:
        max = result

print(max)



