class Solution {
    public int numTeams(int[] arr) {
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i + 1;j<arr.length; j++){
                for(int k =j+1;k<arr.length; k++){
                    if((arr[i] > arr[j] && arr[j] > arr[k]) || (arr[i] < arr[j] && arr[j] < arr[k]))
                        count++;
                }
            }
        }
        return count;
    }
}