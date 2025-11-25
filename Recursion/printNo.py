def solve(n):
    # base case
    if n == 0:return
    print(n)
    solve(n - 1)

def main():
    n = 5
    solve(n)
    return 0

main()