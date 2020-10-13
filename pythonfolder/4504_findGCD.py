num = int(input())

while True:
    check = int(input())
    if check == 0:
        break
    if check % num != 0:
        print('{0} is NOT a multiple of {1}.'.format(check, num))
    else:
        print('{0} is a multiple of {1}.'.format(check, num))