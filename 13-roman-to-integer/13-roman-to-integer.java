class Solution {
    public int romanToInt(String s) {
        
        HashMap<Character, Integer> hs = new HashMap<>();
        
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
        
        int total = 0;
        int sign = 1;
        
        
        char[] ch = s.toCharArray();
        
        for(int i = 0; i<s.length()-1; i++)
        {
            if(hs.get(ch[i]) < hs.get(ch[i+1]))
            {
                total+= hs.get(ch[i]) * -1;
            }
            else
            {
                total+= hs.get(ch[i]);
            }
            
        }
        
        total+= hs.get(ch[s.length() - 1]);
        
        return total;
        
    }
}