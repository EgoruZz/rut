print("Задайте массив из 10 чисел")
a = [int(input(f"Введите элемент {i}: ")) for i in range(10)]

summ = 0
for i in range(len(a)): summ += a[i]
mid = summ / len(a)
print("Среднее арифмитическое массива:", mid)

a = [1 if elem > mid else elem for elem in a]
print("После замены чисел, больших ср. арифм. на 1:", a)
