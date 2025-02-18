class Solution {
    public int findClosestNumber(int[] nums) {
        int closest = nums[0];

        for(int i=1;i<nums.length;i++){
            if(Math.abs(closest) > Math.abs(nums[i])){
                closest = nums[i];
            }
        }

        if(closest < 0){
            for(int i=0;i<nums.length;i++){
                if(Math.abs(closest) == nums[i])
                    return nums[i];
            }
        }

        return closest;
    }
}