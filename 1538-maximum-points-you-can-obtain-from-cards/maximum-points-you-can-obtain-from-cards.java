class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0,maxSum = 0,right = cardPoints.length - 1;
        for(int i =0;i<k; i++){
            sum+=cardPoints[i];
        }
        maxSum = Math.max(maxSum,sum);

        for(int i = k-1; i>=0;i--){
            sum = sum + cardPoints[right] - cardPoints[i];
            maxSum = Math.max(maxSum,sum);
            right--;
        }

        return maxSum;
    }
}