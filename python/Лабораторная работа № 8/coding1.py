n = int(input("Введите порядок квадратной матрицы: "))

N = 29
var = 14
table = [[-1] * n for _ in range(n)]

table = [[N if i < j else var for j in range(n)] for i in range(n)]
for i in range(n): table[i][i] = 0

for row in table: print(*row)
