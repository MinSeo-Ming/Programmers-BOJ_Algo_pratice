num = int(input())
stack = []

for i in range(num):
    inp =int(input())
    if inp!= 0:
        stack.append(inp)
    elif inp == 0:
        stack.pop()

sum = 0
for i in stack:
    sum += i

print(sum)
