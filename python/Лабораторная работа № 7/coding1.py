def devide(number: int) -> int:
    """
    Функция для нахождения количества делителей числа,
    отличных от единицы и самого числа
    param number: число, для которого осуществляется поиск кол-ва делителей
    """

    count = 0
    x = 2
    while x * x <= number:
        if number % x == 0:
            count += 2 if number // x != x else 1
        x += 1
    
    return count


def mod_bubble_sort(a: list) -> list:
    """
    Функция сортировки массива пар по второму элементу в паре
    (пара - это массив из двух элементов)
    param a: список пар, который сортируется по второму эленту
    хранящихся объектов (пар)
    """

    start, diff, n = 0, True, len(a)
    while diff:
        diff = False
        for j in range(0, n - start - 1, 1):
            if a[j][1] > a[j + 1][1]:
                a[j], a[j + 1] = a[j + 1], a[j]
                diff = True
        start += 1
    
    return a


in_data = [int(i) for i in input("Введите два целых числа через пробел -\n\
[начало; конец] диапазона целых чисел соответсвтенно: ").split()]
M, N = in_data[0], in_data[1]

arr = []
for number in range(M, N + 1): arr.append([number, devide(number)])
arr = mod_bubble_sort(arr)

mx = arr[-1][1]
ans = [str(x[0]) for x in arr if x[1] == mx]
f1, f2 = ('a', 'о'), ("ют", "ет")
print(f"Из диапазона [{M}; {N}] числ{f1[0] if len(ans) > 1 else f1[1]}:",\
      ", ".join(ans), f"име{f2[0] if len(ans) > 1 else f2[1]}\
 максимальное кол-во делителей равное {mx}")
