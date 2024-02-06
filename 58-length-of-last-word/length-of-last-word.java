class Solution {
    public int lengthOfLastWord(String s) {
        String[] arrayOfString = s.trim().split(" ",s.length());
        return arrayOfString[arrayOfString.length - 1].length();
    }
}