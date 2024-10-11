class Solution {
    public int findMin(int[] arr) {
         for(int i=1;i<arr.length - 1; i++){
            if(arr[i] < arr[i-1] && arr[i] < arr[i+1])
                return arr[i];
        }
        
        return Math.min(arr[0], arr[arr.length - 1]);
    }
}