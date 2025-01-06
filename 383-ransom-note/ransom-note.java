class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> mp = new HashMap<>();

        //creating seperate bucket to keep track of all the elem
        for(char m : magazine.toCharArray()){
            mp.put(m, mp.getOrDefault(m, 0) + 1);
        }

        //checking if all the elem of ransomNote is present in magazine

        for(char r : ransomNote.toCharArray()){
            if(!mp.containsKey(r))
                return false;

            mp.put(r, mp.get(r) - 1);
            if(mp.get(r) == 0)
                mp.remove(r);

            
        }
        return true;
    }
}