# [k-Anagram](https://www.geeksforgeeks.org/problems/check-if-two-strings-are-k-anagrams-or-not/1)
## Medium
Two strings are called&nbsp;k-anagrams&nbsp;if&nbsp;both of the below&nbsp;conditions are true.1. Both have same&nbsp;number of characters.2. Two strings can become anagram by changing&nbsp;at most&nbsp;k&nbsp;characters in a string.
Given two strings of lowercase alphabets and an integer value k,&nbsp;the task is to find if two strings are&nbsp;k-anagrams&nbsp;of each other or not.
Example:
Input: s1 = "fodr", s2 = "gork", k = 2
Output: true
Explanation: We can change 'f' -&gt; 'g' and 'd' -&gt; 'k' in s1.
Input: s1 = "geeks", s2 = "eggkf", k = 1
Output: false
Explanation: We can update or modify only 1 value but there is a need of modifying 2 characters i.e. 'g' and 'f' in s2.
Input: s1 = "adb", s2 = "fdab", k = 2
Output: false
Explanation: Both the strings have different numbers of characters.
Constraints:1 ≤ s1.size(), s2.size() ≤ 1051 ≤ k ≤ 105