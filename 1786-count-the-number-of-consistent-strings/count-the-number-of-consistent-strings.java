class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] arr = new int[26];
        for(char s : allowed.toCharArray()){
            arr[s - 'a'] = 1;
        }

        int ans = 0;
        for(int i=0;i<words.length;i++){
            int count = 1;
            for(int j=0;j<words[i].length(); j++){
                char key = words[i].charAt(j);
                if(arr[key - 'a'] == 0){
                    count = 0;
                    break;
                }
            }
            if(count == 1)
                ans++;
        }
        return ans;
    }
}