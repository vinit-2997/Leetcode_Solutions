class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        
        for(int i = 0; i<k; i++)
        {
            sum+=nums[i];
        }
        
        max = Math.max(max, sum);
        
        for(int i = k; i<n; i++)
        {
            sum = sum + nums[i] - nums[i-k];
            max = Math.max(max, sum);
        }
        
        return (double)max/k;
    }
}