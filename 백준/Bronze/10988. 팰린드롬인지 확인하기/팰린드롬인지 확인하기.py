import sys
input = sys.stdin.readline

data = input().strip()

result = data[::-1]

pal = 0

if (data == result) :
    pal = 1

print(pal)
    