class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> mp = new HashMap<>();
        HashMap<Character,Integer> count = new HashMap<>();

        for(char c : p.toCharArray())
            mp.put(c, mp.getOrDefault(c, 0) + 1);

        int left = 0;
        for(int right = 0; right<s.length(); right++){
            char key = s.charAt(right);
            count.put(key, count.getOrDefault(key, 0) + 1);
            if(mp.containsKey(key)){
                while(count.get(key) > mp.get(key)){
                    char del = s.charAt(left);
                    count.put(del, count.get(del) - 1);
                    left++;
                }
            }
            if(!mp.containsKey(key)){
                count.clear();
                left = right + 1;
            }

            if(right - left + 1 == p.length()){
                ans.add(left);
                char del = s.charAt(left);
                count.put(del, count.get(del) - 1);
                left++;
            }

        }
        return ans;
    }
}