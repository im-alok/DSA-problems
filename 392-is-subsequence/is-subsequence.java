class Solution {
    public boolean isSubsequence(String s, String t) {
        int up = 0, down = 0;

        while(s.length()!=up && t.length()!=down){
            if(s.charAt(up) == t.charAt(down)){
                up++;
                down++;
            }
            else down++;
        }

        if(up == s.length())
            return true;
        return false;
    } 
}