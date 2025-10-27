a = list(range(-4, 0)) + list(range(-3, 0)); print("Массив a =", a)

a.append(9); print("a.append(9), a = ", a)
a.extend([1, 2, 3]); print("a.extend([1, 2, 3]), a = ", a)
a.insert(-3, 18); print("a.insert(-3, 18), a = ", a)
a.remove(-1); print("a.remove(102), a = ", a)
a.pop(-7); print("a.pop(-7), a = ", a)
a.index(1, 0, len(a)); print("a.index(1, [0, len(a)]), a = ", a)
a.count(-2); print("a.count(-2), a = ", a)
a.reverse(); print("a.reverse(), a = ", a)

b = a.copy(); print("b = a.copy(), a == b =", a)
a.clear(); print("a.clear(), a = ", a)
