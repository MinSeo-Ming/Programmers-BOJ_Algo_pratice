A = int(input())
B = int(input())
C = int(input())
D = int(input())
P = int(input())

temp_1 = P*A
temp_2 =B
if P > C:
    P = P - C
    temp_2 += P*D

if temp_1 < temp_2:
    print(temp_1)
else:
    print(temp_2)