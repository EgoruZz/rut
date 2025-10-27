cost = float(input ("Введите цену одного килограмма картофеля: "))
count = int(input ("Введите количество килограмм картофеля большее 20: "))
summ = 0

for num in range(1, count + 1):
    if num % 5 == 0: continue
    summ += cost
    
print("Стоимость всей массы картофеля равна", summ)
