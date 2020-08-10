class Solution {
public void merge(int[] nums1, int m, int[] nums2, int n) {
    int l = m+n-1;
    m--;
    n--;
    while (m >= 0 && n >= 0) {
        if (nums1[m] > nums2[n]) {
            nums1[l] = nums1[m];
            l--;
            m--;
        } else {
            nums1[l] = nums2[n];
            l--;
            n--;
        }
    }
    // if nums2 still has sth left 
    for (int i = 0; i <= n; i++) {
        nums1[i] = nums2[i];
    }
}


}