# [Row with Minimum 1s](https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1)
## Easy
Given a 2D binary matrix(1-based indexed) mat[][], find the row that contains the minimum number of 1's. If two or more rows contain the minimum number of 1's, the answer is the lowest of those indices.Examples :Input: mat[][] = [[1, 1, 1, 1], [1, 1, 0, 0], [0, 0, 1, 1], [1, 1, 1, 1]]
Output: 2
Explanation: Rows 2 and 3 contain the minimum number of 1's (2 each). Since, row 2 is less than row 3. Thus, the answer is 2.Input: mat[][] = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
Output: 1
Explanation: All the rows contain the same number of 1's (0 each). Among them, index 1 is the smallest, so the answer is 1.