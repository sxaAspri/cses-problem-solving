n = int(input())

res = 0


for i in range(1, n + 1):
    res = res ^ i


for x in map(int, input().split()):
    res = res ^ x

print(res)