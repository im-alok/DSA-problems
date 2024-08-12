class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int max = 0;
        int left =0,right = 0;

        for(right = 0; right<nums.length; right++){
            int win = right - left + 1;
            if(nums[right] == 1) count++;
            if(win - count <= k){
                max = Math.max(max,win);
            }
            

            while(win - count > k){
                if(nums[left] == 1) count--;
                left++;
                win = right - left + 1;
            }
        }

        return max;
    }
}