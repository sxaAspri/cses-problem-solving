n = int(input())
arr = list(map(int, input().split()))

moves = 0
max = arr[0]

for i in range(1, n):
    if arr[i] < max:
        moves += max - arr[i]
    else:
        max = arr[i]

print(moves)