dir ={1:1, 2:1}

def fibo(n):
  if n in dir:
    return dir[n]
  dir[n] = (fibo(n-1) + fibo(n-2))%10009
  return dir[n]

n = int(input())
print(fibo(n))
