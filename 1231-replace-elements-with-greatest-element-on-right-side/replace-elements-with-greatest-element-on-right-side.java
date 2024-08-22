class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            ans[i] = greatestElement(arr,i+1);
        }
        return ans;
    }

    public int greatestElement(int[] arr, int start){
        int max = -1;
        for(int i = start; i<arr.length;i++){
            max = Math.max(max, arr[i]);
        }

        return max;
    }
}