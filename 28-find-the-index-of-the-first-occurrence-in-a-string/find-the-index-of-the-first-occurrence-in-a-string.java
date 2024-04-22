class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<=haystack.length() - needle.length();i++){
            String ans = haystack.substring(i,i + needle.length());
            if(needle.equals(ans))
                return i;
        }
        return -1;
    }
}