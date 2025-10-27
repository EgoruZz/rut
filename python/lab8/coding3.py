n = int(input("Введите порядок квадратной матрицы: "))

table = [[-1] * n for _ in range(n)]
num = 1
for i in range(n): table[0][i], num = num, num + 1

for i in range(1, n // 2 + 1):
    for j in range(i, n - i + 1): table[j][n - i], num = num, num + 1
    for j in range(n - i - 1, i - 1, -1): table[n - i][j], num = num, num + 1
    for j in range(n - i, i - 1, -1): table[j][i - 1], num = num, num + 1
    for j in range(i, n - i): table[i][j], num = num, num + 1

for row in table: print(*row)
