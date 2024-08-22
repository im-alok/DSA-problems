class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(char c : s.toCharArray())
            mp.put(c,mp.getOrDefault(c,0) + 1);
        for(char c : t.toCharArray()){
            if(mp.containsKey(c)){
                mp.put(c,mp.get(c) - 1);
                if(mp.get(c) == 0)
                    mp.remove(c);
            }else return false;
        }

        if(mp.size() > 0)
            return false;
        return true;
    }
}