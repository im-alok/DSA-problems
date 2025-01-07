class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a  = m-1;
        int b = n-1;
        int p = m+n-1;

        while(a>=0 && b>=0){
            if(nums1[a] > nums2[b]){
                nums1[p] = nums1[a];
                a--;
                p--;
            }else{
                nums1[p] = nums2[b];
                b--;
                p--;
            }
        }

        while(b>=0){
            nums1[p] = nums2[b];
            b--;
            p--;
        }

    }
}