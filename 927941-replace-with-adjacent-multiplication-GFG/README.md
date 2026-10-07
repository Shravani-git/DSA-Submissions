# [Replace with Adjacent Multiplication](https://www.geeksforgeeks.org/problems/replace-with-adjacent-multiplication/1)
## Easy
Given an array arr[], replace every element with the product of itself and its adjacent elements. 

For index i: arr[i] = arr[i-1] * arr[i] * arr[i+1] 
Assume the previous element of the first element and the next element of the last element as 1.

Examples :
Input: arr[] = [2, 4, 5]
Output: [8, 40, 20]
Explanation:
For index i = 0, arr[0] = 1 * arr[0] * arr[1] = 1 * 2 * 4 = 8
For index i = 1, arr[1] = arr[0] * arr[1] * arr[2] = 2 * 4 * 5 = 40
For index i = 2, arr[2] = arr[1] * arr[2] * 1 = 4 * 5 * 1 = 20
Thus, the updated array becomes [8, 40, 20].
Input: arr[] = [2, 5, 7, 8, 3]Output: [10, 70, 280, 168, 24]Explanation:For index i = 0, arr[0] = 1 * arr[0] * arr[1] = 1 * 2 * 5 = 10
For index i = 1, arr[1] = arr[0] * arr[1] * arr[2] = 2 * 5 * 7 = 70
For index i = 2, arr[2] = arr[1] * arr[2] * arr[3] = 5 * 7 * 8 = 280
For index i = 3, arr[3] = arr[2] * arr[3] * arr[4] = 7 * 8 * 3 = 168
For index i = 4, arr[4] = arr[3] * arr[4] * 1 = 8 * 3 * 1 = 24Thus, the updated array becomes [10, 70, 280, 168, 24].
Constraints:1 ≤ arr[i] ≤ 1031 ≤ arr.size() ≤ 105