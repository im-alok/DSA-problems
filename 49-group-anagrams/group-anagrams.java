class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String,Boolean> mp = new HashMap<>();
        if(strs.length == 0){
            ArrayList<String> arr = new ArrayList<>();
            arr.add(" ");
            res.add(arr);
            return res;
        }

        for(int i=0;i<strs.length; i++){
            if(!mp.containsKey(strs[i])){
                mp.put(strs[i], true);
                ArrayList<String> arr = new ArrayList<>();
                arr.add(strs[i]);
                for(int j = i+1; j<strs.length; j++){
                    if(Anagram(strs[i],strs[j])){
                        arr.add(strs[j]);
                        mp.put(strs[j], true);
                    }
                }
                res.add(arr);
            }
        }
        return res;
    }

    //check for Anagram
    public boolean Anagram(String ransomNote, String magazine) {
        HashMap<Character, Integer> mp = new HashMap<>();
        if(ransomNote.length() != magazine.length())   return false;

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