n = int(input())

if n == 1:
    print(1)
elif n == 2 or n == 3:
    print("NO SOLUTION")
else:
    res = []

    # pares
    for i in range(2, n + 1, 2):
        res.append(i)

    # impares
    for i in range(1, n + 1, 2):
        res.append(i)

    print(*res)