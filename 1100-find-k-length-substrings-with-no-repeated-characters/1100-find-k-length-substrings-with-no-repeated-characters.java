class Solution {
    public int numKLenSubstrNoRepeats(String s, int k) {
        
        //ini
        int n = s.length();
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        int count = 0;
        
        if(k>n)
        {
            return 0;
        }
        
        for(int i =0 ;i<k; i++)
        {
            hs.put(s.charAt(i), hs.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        if(hs.size() == k)
        {
            count++;
        }
        
        //loop
        
        for(int right = k; right < n; right++)
        {
            //add
            hs.put(s.charAt(right), hs.getOrDefault(s.charAt(right), 0) + 1);
            
            //rem
            hs.put(s.charAt(right - k), hs.getOrDefault(s.charAt(right-k), 0) - 1);

            if(hs.getOrDefault(s.charAt(right-k), -1) == 0)
            {
                hs.remove(s.charAt(right-k));
            }
            
            if(hs.size() == k)
            {
                count++;
            }

        }

        return count;
        
    }
}