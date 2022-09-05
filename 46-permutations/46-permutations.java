class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, new ArrayList<Integer>(), result);
        
        return result;
        
    }
    
    public  void helper(int[] nums, int i, ArrayList<Integer> slate, List<List<Integer>> result)
    {
        if(i == nums.length)
        {
            result.add(new ArrayList<>(slate));
            return;
        }

        for(int k = i; k<nums.length; k++)
        {
            swap(nums, k, i);
            slate.add(nums[i]);
            helper(nums, i+1, slate, result);
            slate.remove(slate.size()-1);
            swap(nums, k, i);
        }
    }
    
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}