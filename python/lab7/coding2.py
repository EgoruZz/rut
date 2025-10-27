def distance(points: tuple) -> int:
    
    """
    Процедура для нахождения наибольшего расстояния между
    двумя точками из кортежа points и выявления этих точек
    param points: кортеж точек, введенных пользователем
    """

    dist_max = -float('inf')
    pair_max = [-1, -1]

    for point1 in points:
        for point2 in points:
            if point1 == point2: continue
            x1, y1 = float(point1[0]), float(point1[1])
            x2, y2 = float(point2[0]), float(point2[1])
            dist = ((x1 - x2)**2 + (y1 - y2)**2)**0.5
            if dist_max < dist:
                pair_max = [point1, point2]
                dist_max = dist
    
    print(f"Среди всего набора точек X, Y, Z, P точки {pair_max[0][2].upper()} и\
 {pair_max[1][2].upper()} максимально удалены\nдруг от друга на расстояние\
 равное {dist_max}")


x = input("Введите через пробел две координаты точки X: ").split() + ['x']
y = input("Введите через пробел две координаты точки Y: ").split() + ['y']
z = input("Введите через пробел две координаты точки Z: ").split() + ['z']
p = input("Введите через пробел две координаты точки P: ").split() + ['p']

distance((x, y, z, p))
