a = int(input())


def fibo(a):
    if a <= 1:
        return a
    else:
        return fibo(a - 1) + fibo(a - 2)


print(fibo(a))
