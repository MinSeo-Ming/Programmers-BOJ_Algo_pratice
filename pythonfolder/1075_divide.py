first = input()
div = int(input())
zero = "00"

cp_fi = first[:-2] + zero
cp_fi = int(cp_fi)

temp = cp_fi/div
if temp % 1 != 0:
    temp = int(temp)+1

temp = temp * div - cp_fi

if temp < 10:
    print("0", end='')
print(int(temp))
