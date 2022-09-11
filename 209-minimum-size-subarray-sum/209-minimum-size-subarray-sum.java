class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        
        
        //ini
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;
        
        
        //loop
        
        for(int i = 0; i<nums.length; i++)
        {
            sum += nums[i];
            

                while(left<=i && sum>=target)
                {
                    sum-=nums[left];
                    minLen = Math.min(minLen, i - left+1);
                    left++;
                }
            
            
            
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;
    }
}