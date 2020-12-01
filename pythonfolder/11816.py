check = input()

oct = '0o'

if check[0] == '0':
    if check[1] =='x':
        print(int(check,16))
    else:
        check = check[:1]+'o'+check[1:]
        print(int(check, 8))
else:
    print(int(check))
