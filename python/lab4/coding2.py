a = input("Введите непустую последовательность целых чисел, ввод завершите числом 0: ").split()
a = [int(number) for number in a]

if a[-1] == 0:

    count = 0
    summ = 0
    arr = []

    while True:
        arr.append(a[count])
        if arr[count] == 0:
            count += 1
            break
        count += 1

    idx = 0
    while idx < count:
        summ += arr[idx]
        idx += 1

    print("Сумма введенной последовательности чисел:", summ)
    print("Количество введенных чисел в последовательности:", count)
else:
    print("Ввод данных некорректен, завершите последовательность числом 0")
