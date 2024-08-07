class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int left = 0;
        int max = 0;

        int right = 0;
        for(right = 0;right<s.length();right++){
            char key = s.charAt(right);
            if(mp.containsKey(key)){
                max = Math.max(max,right - left);
                while(mp.containsKey(key)){
                    mp.remove(s.charAt(left));
                    left = left + 1;
                }
            }
            mp.put(key,1);
        }
        max = Math.max(max,right-left);
        return max;
    }
}