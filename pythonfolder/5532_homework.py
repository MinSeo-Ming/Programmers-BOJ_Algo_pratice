l = int(input())
a = int(input())
b = int(input())
c = int(input())
d = int(input())

m_d = 0
l_d = 0

if a % c != 0:
    m_d = int(a/c) + 1
elif a%c == 0:
    m_d = int(a/c)

if b % d !=0:
    l_d = int(b/d) + 1
elif b% d == 0:
    l_d = int(b/d)

if m_d > l_d:
    print(l - m_d)
else:
    print(l - l_d)
