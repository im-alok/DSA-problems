class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for(int right=0;right<nums.length;right++){
            if(nums[right] == 0){
                max = Math.max(count,max);
                count = 0;
            }
            else
                count++;
            
        }
        return  Math.max(count,max);
    }
}