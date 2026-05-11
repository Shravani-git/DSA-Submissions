class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m+n];
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            merged[m + i] = nums2[i];
        }
        int i = 0;
        int j = merged.length - 1;
        Arrays.sort(merged);
        while (i < j) {
            i++;
            j--;
        }
        if (i == j) {
            return merged[i] * 1.0;
        } else {
            return (merged[i] + merged[j]) / 2.0;
        }

    }
    
}