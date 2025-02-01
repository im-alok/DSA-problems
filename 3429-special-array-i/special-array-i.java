class Solution {
     boolean parity(int num){
        if((num&1) == 0)
            return true;
        else return false;
    }


    public boolean isArraySpecial(int[] nums) {
        if(nums.length == 1)
            return true;

        for(int i=0;i<nums.length - 1;i++)
            if(parity(nums[i]) == parity(nums[i+1]))
                return false;

        return true;

    }

   
}