import sys
input = sys.stdin.readline 

arr = [list(map(int, input().split())) for _ in range(9)]

n = 0
m = 0
cnt = -1

for i in range(9) :
    for j in range(9) :
        if cnt < arr[i][j] :
            cnt = arr[i][j] 
            n = i+1 
            m = j+1
print(cnt)
print(n, m)
