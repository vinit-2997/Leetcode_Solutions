class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character, Integer> hr = new HashMap<>();
        HashMap<Character, Integer> hs = new HashMap<>();
        
        for(char ch : ransomNote.toCharArray())
        {
            hr.put(ch, hr.getOrDefault(ch, 0) + 1);
        }
        
                
        for(char ch : magazine.toCharArray())
        {
            hs.put(ch, hs.getOrDefault(ch, 0) + 1);
        }
        
//         for (Map.Entry<Character, Integer> entry : hr.entrySet()) 
//         {
//             Character key = entry.getKey();
//             Integer value = entry.getValue();
            
//             if(hs.containsKey(key))
//             {
//                 hs.put(key, hs.getOrDefault(key, 0) - value);
//                 if(hs.getOrDefault(key, -1) >= 0)
//                     hs.remove(key);
//                 else
//                     return false;
//             }
//             else
//                 return false;
//         }
        
        for (Map.Entry<Character, Integer> entry : hr.entrySet()) 
        {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            
            if(hs.getOrDefault(key, -1) < value)
                return false;

        }
        
        return true;
        
    }
}


//better sol

// class Solution {
//     public boolean canConstruct(String ransomNote, String magazine) {
        
//         HashMap<Character, Integer> hs = new HashMap<>();
        
//         for(char c : magazine.toCharArray())
//         {
//             hs.put(c, hs.getOrDefault(c, 0) + 1);
//         }
        
//         for(char s:ransomNote.toCharArray())
//         {
//             if(!hs.containsKey(s))
//                 return false;
//             hs.put(s, hs.getOrDefault(s, 0) - 1);
//             if(hs.get(s) == 0)
//                 hs.remove(s);
//         }
        
//         return true;
        
//     }
// }