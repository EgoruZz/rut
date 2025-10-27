n = int(input("Введите порядок квадратной матрицы: "))
m = int(input("Выберите номер строки в этой матрице: ")) - 1

table = [[i + 1] * n for i in range(n)]
for row in table: print(*row)

idx = -1
val = -float('inf')
for i in range(n):
    if table[i][i] > val:
        val = table[i][i]
        idx = i

table[m], table[idx] = table[idx], table[m]

print()
for row in table: print(*row)
