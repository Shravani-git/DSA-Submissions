# [Nth Geeky Number](https://www.geeksforgeeks.org/problems/is-it-fibonacci--170647/1)
## Easy
Geek has defined a sequence called Geeky Numbers. The initial k terms of the sequence are given in an array geekNum[] of length k.Every subsequent term is obtained by taking the sum of the previous k&nbsp;terms.The sequence uses 1-based indexing, so the first element of geekNum[] represents the 1st term of the sequence.Also given an integer n,&nbsp;return the nth term of the Geeky sequence.Examples:Input: n = 5, geekNum[] = [0, 1, 2]
Output: 6
Explanation: The array geekNum[] contains 3 initial terms, so each subsequent term is the sum of the previous 3 terms.  The sequence is: 0, 1, 2, (0 + 1 + 2), (1 + 2 + 3). Therefore, the sequence becomes 0, 1, 2, 3, 6 and the 5th term is 6.|Input: n = 6, geekNum[] = [4]
Output: 4
Explanation: Since geekNum[] contains only one initial term, each subsequent term is the sum of the previous one term. Therefore, every term remains 4. Hence, the sequence is 4, 4, 4, 4, 4, 4, and the 6th term is 4.