# [Print Number Pattern](https://www.geeksforgeeks.org/problems/print-the-pattern-set-1/1?page=2&difficulty=Basic&sortBy=submissions)
## Easy
You are given a number n. You need to generate and print a pattern based on the given value of n.

For each row, starting from the first, print numbers in descending order from n down to 1.
Each number in a row is repeated as many times as the current row index (starting from n).
Instead of printing each row on a new line, separate rows with -1.
Instead of a newline at the end of each row, print&nbsp;-1&nbsp;to indicate row separation. After printing the entire pattern, end the output with -1.

For n= 3,pattern:&nbsp; 3 3 3 2 2 2 1 1 1&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 3 3 2 2 1 1&nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 3 2 1
For n= 2,pattern:&nbsp; 2 2 1 1&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 2 1
Examples :
Input: 2
Output: [2, 2, 1, 1, -1, 2, 1, -1]
Input: 3
Output: [3, 3, 3, 2, 2, 2, 1, 1, 1, -1, 3, 3, 2, 2, 1, 1, -1, 3, 2, 1, -1]
Input: 1
Output: [1, -1]
Constraints:1 &lt;= n &lt;= 40