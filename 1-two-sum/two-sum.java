class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int[] result = new int[2];
        int idx = 0;
        for(int elem : nums){
            if(mp.containsKey(target - elem)){
                result[0] = mp.get(target-elem);
                result[1] = idx;

                return result;
            }
            mp.put(elem, idx);
            idx++;

        }

        return new int[]{-1,-1};
    }
}