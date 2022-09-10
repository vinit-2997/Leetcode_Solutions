class Solution {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        
        
                //ini
        int count = 0;
        float avg = 0;
        int sum = 0;
        
        for(int i = 0; i<k; i++)
        {
            sum = sum+calories[i];
        }
                
        if(sum > upper)
        {
            count++;
        }
        
        if(sum < lower)
        {
            count--;
        }
        
        
        for(int i = k; i < calories.length; i++)
        {
            sum = sum + calories[i] - calories[i-k];
            
            if(sum > upper)
            {
                count++;
            }
            
               if(sum < lower)
            {
                count--;
            }
        }
        
        return count;
    }
        
    
}