class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int c:nums)
            mp.put(c,mp.getOrDefault(c,0) + 1);
        for(int c : nums)
            if(mp.get(c) >=2)
                return true;
        return false;
    }
}