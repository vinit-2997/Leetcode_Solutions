class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        
        ///ini
        HashMap<Character, Integer> h1= new HashMap<Character, Integer>();
        HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();
        int k = s1.length();
        
        if(k>s2.length())
            return false;
        
        for(int i = 0; i<k; i++)
        {
            h1.put(s1.charAt(i), h1.getOrDefault(s1.charAt(i), 0) + 1);
        }
    
        //looop
        
        for(int i = 0; i<k; i++)
        {
            h2.put(s2.charAt(i), h2.getOrDefault(s2.charAt(i), 0) + 1);

        }
         
        if(h1.equals(h2))
            return true;
        
        for(int i = k; i<s2.length(); i++)
        {
            h2.put(s2.charAt(i), h2.getOrDefault(s2.charAt(i), 0) + 1);
            h2.put(s2.charAt(i - k), h2.getOrDefault(s2.charAt(i - k), 0) - 1);
            
            if(h2.get(s2.charAt(i - k)) == 0)
                h2.remove(s2.charAt(i - k));
            
            if(h1.equals(h2))
                return true;
        }
        
        return false;
        
    }
}