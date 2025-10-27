from math import *

x = float(input("Введите переменную x: "))
t = float(input("Введите переменную t: "))
N = 29

z = (9*pi*t + 10*cos(x)) / (sqrt(t) - abs(sin(t))) \
    * pow(e, x) * factorial(N) / sqrt(N)

print("z = {0:.2f}".format(z))
