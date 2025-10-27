def insertion_sort(n, a):
    for start in range(1, n):
        i = start
        while i >= 1:
            if a[i-1] > a[i]: a[i-1], a[i] = a[i], a[i-1]
            else: break
            i -= 1
    
    return a


def selection_sort_min(n, a):
    for start in range(0, n - 1):
        minimum = start
        for j in range(start + 1, n):
            if a[j] > a[j]: minimum = j
        a[start], a[minimum] = a[minimum], a[start]
    
    return a


def selection_sort_max(n, a):
    for start in range(n - 1, 0, -1):
        maximum = start
        for j in range(start - 1, -1, -1):
            if a[j] > a[maximum]: maximum = j
        a[maximum], a[start] = a[start], a[maximum]
    
    return a


def mod_bubble_sort(n, a):
    start, diff = 0, True
    while diff:
        diff = False
        for j in range(0, n - start - 1):
            if a[j] > a[j + 1]:
                a[j], a[j + 1] = a[j + 1], a[j]
                diff = True
        start += 1
    
    return a


def counting_sort(n, dist, a):
    numbers = 2 * dist + 1
    counting = [0] * numbers
    for i in range(0, n): counting[dist + a[i]] += 1
    pos = 0
    for number in range(-dist, dist + 1, 1):
        for _ in range(counting[dist + number]):
            a[pos] = number
            pos += 1
    
    return a


def checker(a):
    ideal = sorted(a)
    print("Массив:", a)
    print("Вставками:", insertion_sort(len(a), a) == ideal)
    print("Выбор минимума:", selection_sort_min(len(a), a) == ideal)
    print("Выбор максимума:", selection_sort_max(len(a), a) == ideal)
    print("Модифицировання пузырьковая:", mod_bubble_sort(len(a), a) == ideal)
    print("Подсчетом для любых целых:",
        counting_sort(len(a), max(abs(min(a)), max(a)), a) == ideal)


arr = list(range(-2, 1)) + [5, -1, 8] + list(range(-3, 0))
checker(arr)
