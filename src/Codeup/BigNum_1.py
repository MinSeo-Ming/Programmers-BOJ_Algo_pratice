n, m, k = map(int, input().split())
data = list(map(int, input().split()))

data.sort();
result = 0
result += (int)(m/(k+1) * (data[n-1] * k + data[n-2]))
result += (int)(m % (k+1) * data[n-1])
print(result)

'''
5 8 3
2 4 5 4 6
'''