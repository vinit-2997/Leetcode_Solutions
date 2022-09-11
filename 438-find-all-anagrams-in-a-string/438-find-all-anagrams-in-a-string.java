class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        
        
        
        
        
        ///ini
        HashMap<Character, Integer> h1= new HashMap<Character, Integer>();
        HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();
        List<Integer> res = new ArrayList<Integer>();
        
        int k = p.length();
        
        if(k>s.length())
            return res;
        
        for(int i = 0; i<k; i++)
        {
            h1.put(p.charAt(i), h1.getOrDefault(p.charAt(i), 0) + 1);
        }
    
        //looop
        
        for(int i = 0; i<k; i++)
        {
            h2.put(s.charAt(i), h2.getOrDefault(s.charAt(i), 0) + 1);

        }
         
            if(h1.equals(h2))
                res.add(0);
        
        for(int i = k; i<s.length(); i++)
        {
            h2.put(s.charAt(i), h2.getOrDefault(s.charAt(i), 0) + 1);
            h2.put(s.charAt(i - k), h2.getOrDefault(s.charAt(i - k), 0) - 1);
            
            if(h2.get(s.charAt(i - k)) == 0)
                h2.remove(s.charAt(i - k));
            
            if(h1.equals(h2))
                res.add(i-k+1);;
        }
        
        return res;
        
        
    }
}