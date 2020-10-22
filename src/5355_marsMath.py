repeat = int(input())

for i in range(repeat):
    nums = input().split()
    result = float(nums[0])
    for k in nums:
        if k == '@':
            result *= 3
        elif k == '%':
            result += 5
        elif k == '#':
            result -= 7
        else:
            continue
    print(format(result, ".2f"))
