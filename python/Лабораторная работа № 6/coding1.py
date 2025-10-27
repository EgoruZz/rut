n = int(input("Введите длину массива: "))
a = [int(input(f"Введите элемент {i}: ")) for i in range(n)]
print("Исохдный массив: ", a)

mn = [int(10e13), -1]
mx = [int(-10e13), -1]
for i in range(n):
    if mn[0] > a[i]: mn = [a[i], i]
    if mx[0] < a[i]: mx = [a[i], i]

a[mn[1]], a[mx[1]] = a[mx[1]], a[mn[1]]
print("Полученный массив: ", a)
