def solve(A, B):
    return A if B == 0 else solve(B, A % B)
    
T = int(input())

for i in range(T):
    A, B = map(int, input().split())
    print(solve(A, B))
