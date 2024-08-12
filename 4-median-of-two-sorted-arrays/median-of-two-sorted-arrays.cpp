class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();
        nums1.resize(n+ m);
        for(int i=0;i<m ;i++){
            nums1[n+i] = nums2[i] ;
        }
        sort(nums1.begin(), nums1.end());

        int size = nums1.size();
        if(size % 2 ==0){
            return (double)( nums1[size/2-1] + nums1[size/2] ) / 2.0;
        }
        else{
            return (double)nums1[size/2];
        }
    }
};