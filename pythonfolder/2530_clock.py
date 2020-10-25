hour, min, sec = list(map(int, input().split()))
take = int(input())

sec_r = (sec + take) % 60
min_t = (sec + take) // 60
min_r =(min + min_t) % 60
hour_t = (min+min_t) // 60
hour_r = (hour +hour_t) % 24

print(hour_r, min_r, sec_r)
