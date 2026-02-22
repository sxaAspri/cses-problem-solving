s = input().strip()

max_len = 1
current = 1

for i in range(1, len(s)):
    if s[i] == s[i - 1]:
        current += 1
    else:
        current = 1
    max_len = max(max_len, current)

print(max_len)