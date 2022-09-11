class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        
        
        
        //ini
        int[] res = new int[nums.length - k+1];
        int l = 0;
        
        Deque<Integer> deque = new LinkedList<Integer>();
        
        
        for(int i = 0; i<k; i++)
        {
            while(!deque.isEmpty() && nums[i]>deque.peekLast())
            {
                deque.removeLast();
            }
            
            deque.addLast(nums[i]);
            
        }
        res[l++] = deque.peekFirst();
        
        //loop
        for(int i = k; i<nums.length; i++)
        {
            if(nums[i-k] == deque.peekFirst())
                deque.removeFirst();
            //left++;
            while(!deque.isEmpty() && nums[i]>deque.peekLast())
            {
                deque.removeLast();
            }
            
            deque.addLast(nums[i]);
            res[l++] = deque.peekFirst();
            
        }
        
        return res;
        
    }
}