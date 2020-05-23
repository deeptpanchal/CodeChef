import math

x = int(input())
for i in range(x):
    n, q = map(int, input().split())
    d = list(map(int, input().split()))
    x = list(map(int, input().split()))
    k = 1
    for j in d:
        k = k * j
    for j in x:
        print(math.floor(j/k), end=' ')
    print()
