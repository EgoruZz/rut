s1 = input()
s1 = len(s1.split(" е")) if (s1[0] == "е") else len(s1.split(" е")) - 1
print(s1)

s2 = input().replace(":", "%")
print(s2.count("%"))

s3 = input()
print(s3.count("."))
s3 = s3.replace(".","")

s4 = input()
print(s4.count("а"), len(s4))
s4 = s4.replace("а", "о")

s5 = input()
s5 = s5.lower()

s6 = input()
print(s6.count("а"))
s6 = s6.replace("а", "")

s7 = input()
s7 = s7[0:len(s7) // 2 + 1].replace("п", "*") + s7[len(s7) // 2 + 1:]
print(s7)

s8 = input()
print(len(s8.split()))

s9 = input("Введите текст: ")
word = input("Введите слово для поиска его количества в тексте: ")
print(s9.count(word))

s10 = input()
print(" ".join([w[0].upper() + w[1::] for w in s10.split()]))

s11 = input()
res = [int(s11[0] == "н")] + [0] * (len(s11) - 1)
for i in range(1, len(s11)):
    res[i] = res[i - 1] + 1 if s11[i] == "н" else 0
print(max(res))
s11 = s11.replace("!", ".")

s12 = input()
print(*[w for w in s12.split() if w[-1] == "я"])

s13 = input()
print(s13[s13.index("(") + 1 : s13.index(")")])

s14 = input()
print(*[w for w in s14.split() if w[0] == "а" or w[-1] == "я"])

s15 = input()
print(s15.count("т"))
