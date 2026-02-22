n = int(input())

recorrido = [n]

while n != 1:
    if n % 2 == 0: #par
        n = n // 2
    else:          #impa
        n = n * 3 + 1
    recorrido.append(n)


print(*recorrido)