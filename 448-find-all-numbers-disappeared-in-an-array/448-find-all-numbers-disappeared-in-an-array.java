class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> result = new ArrayList<>();
        
        HashSet hs = new HashSet();
        
        for(int n : nums) hs.add(n);
        int i = 0;
        
        for(i = 1; i<=nums.length; i++)
        {
            if(!hs.contains(i))
            {
                result.add(i);
            }
        }
        
        return result;
        
    }
}