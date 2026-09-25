# [Cricket Average](https://www.geeksforgeeks.org/problems/cricket-average2031/1)
## Easy
Given two arrays of same size a[] and b[], representing the runs scored by a player and their status ("out" or "notout") in each of the matches, find the player's batting average.
The average is defined as the total runs scored divided by the number of times the player got out, rounded up to the nearest integer (ceil value). If the player never got out across all matches, return -1.
Examples:
Input: a[] = [10, 101, 49], b[] = ["out", "notout", "out"]
Output: 80
Explanation: Total run = 10 + 101 + 49 = 160. The player gets out 2 times. So, average = 160 / 2 = 80.
Input: a[] = [15, 42, 20], b[] = ["out", "out", "notout"]
Output: 39
Explanation: Total run = 15 + 42 + 20 = 77. The player gets out 2 times. So, average = 77 / 2 = 38.5, which rounds up to 39.
Constraints:1 ≤ a.size() = b.size() ≤ 5001 ≤ a[i] ≤ 300b[i] = "out" or b[i] = "notout"