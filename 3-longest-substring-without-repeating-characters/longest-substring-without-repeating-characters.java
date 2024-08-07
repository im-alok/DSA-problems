class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() == 0)
            return 0;

        HashMap<Character,Integer> count = new HashMap<>();
        int left = 0,right = 1,max= Integer.MIN_VALUE;
        count.put(s.charAt(left),1);

        while(right!=s.length()){
            char key = s.charAt(right);
            if(count.containsKey(key)){
                max = Math.max(max,(right - left));
                count.clear();
                left = left+1;
                count.put(s.charAt(left),1);
                right=left+1;
            }
            else{
                count.put(s.charAt(right),1);
                right++;
            }
        }

        max = Math.max(max,(right - left));
        return max;
    }
}