## Rules
- k,n are natural (0, 1, 2, 3, ..)
- k is odd
- k * 2^n + 1 should be **not** prime

## Files
- NotSPS.java : finds all 'n' values for a specific 'k' that makes k*2^n+1 **not** a Sierpinski number
- Utils.java : Some optimized algorithms
- Config.java : Public variables and constant values
- RaceAlgo.java : An optimized brute force

## Plan
- Narrow down potential 'n' values.
  - (Expr.1) See what 'n' values fails the k*2^n+1 relation for all 'k's, see similarities
- Narrow down potential 'k' values.
  - See what 'k,n' pairs failed from (Expr.1) and find 'n,k' corresponding values such that k * 2^n + 1 = n * 2^k + 1
    - Note: See results/Result1.out
  - See special similiarities in sierpinski numbers, narrow down range
- Try to find alternate forms to Sierpinski.
  - Equate it to another relation(s) that we would guarantee that would produce composite (not prime) numbers
