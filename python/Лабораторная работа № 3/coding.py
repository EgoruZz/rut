a1 = int(input("Введите первое число: "))
a2 = int(input("Введите второе число: "))
a3 = int(input("Введите третье число: "))
a4 = int(input("Введите четвертое число: "))
a5 = int(input("Введите пятое число: "))

ans = -1

if (a1 >= a2 or a2 > 10) and (a1 >= a3 or a3 > 10) and \
    (a1 >= a4 or a4 > 10) and (a1 >= a5 or a5 > 10):
    if 1 <= a1 <= 10: ans = a1

if (a2 >= a1 or a1 > 10) and (a2 >= a3 or a3 > 10) and \
    (a2 >= a4 or a4 > 10) and (a2 >= a5 or a5 > 10):
    if 1 <= a2 <= 10: ans = a2

if (a3 >= a2 or a2 > 10) and (a3 >= a1 or a1 > 10) and \
    (a3 >= a4 or a4 > 10) and (a3 >= a5 or a5 > 10):
    if 1 <= a3 <= 10: ans = a3

if (a4 >= a2 or a2 > 10) and (a4 >= a3 or a3 > 10) and \
    (a4 >= a1 or a1 > 10) and (a4 >= a5 or a5 > 10):
    if 1 <= a4 <= 10: ans = a4

if (a5 >= a2 or a2 > 10) and (a5 >= a3 or a3 > 10) and \
    (a5 >= a4 or a4 > 10) and (a5 >= a1 or a1 > 10):
    if 1 <= a5 <= 10: ans = a5

if ans != -1: print(ans)
else: print("Среди введенных Вами чисел нет максимального,\
            \n принадлежащего отрезку [1;10]")
