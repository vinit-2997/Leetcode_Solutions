class Solution {
    public int missingNumber(int[] nums) {
        
        HashSet<Integer> hs = new HashSet<>();
        
        for(int n : nums) hs.add(n);
        int i = 0;
        
        for( i = 0; i<=nums.length; i++)
        {
            if(!hs.contains(i))
            {
                return i;
            }
        }
        
        return i;
        
    }
}