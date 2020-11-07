repeat = int(input())
for i in range(repeat):
    nums = sorted(map(int, input().split()))
    print('Scenario #{}:\n{}\n'.format(i+1,'yes'if nums[2] **2 == nums[1]**2+nums[0]**2 else'no'))