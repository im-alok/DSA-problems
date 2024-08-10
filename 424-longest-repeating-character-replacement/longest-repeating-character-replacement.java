class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mp = new HashMap<>();
        int left = 0;
        int max = 0;

        for(int right = 0;right<s.length();right++){
            int win = right - left + 1;
            char data = s.charAt(right);
            mp.put(data, mp.getOrDefault(data,0) + 1);

            if(win - Collections.max(mp.values()) <= k){
                max = Math.max(max,win);
            }

            else{
                while(win - Collections.max(mp.values()) > k){
                    char key = s.charAt(left);
                    if(mp.containsKey(key)){
                        mp.put(key, mp.get(key) - 1);
                    }
                    left++;
                    win = right - left + 1;
                }
            }
        }
        return max;
    }
}