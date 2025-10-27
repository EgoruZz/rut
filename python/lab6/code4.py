data = [input().split() for _ in range(34)]

new_data = [data[i][0:3] + [data[i][-1].split(".")] for i in range(len(data))]
new_data.sort(key=lambda x: (x[-1][1], x[-1][0], x[-1][2]))

k = 1
for elem in new_data:
    print(k, *elem[0:3], end=" ")
    print(*elem[-1], sep=".")
    k += 1
