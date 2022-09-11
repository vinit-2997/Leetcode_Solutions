class Solution {
    public int maxVowels(String s, int k) {
        
        //ini

        int n = s.length();
        int vowel = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i = 0; i<k; i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u' )
                vowel = vowel + 1;
        }
        
        max = Math.max(max, vowel);        
        
        //loop
        
        for(int right = k; right<n; right++)
        {
            if(s.charAt(right) == 'a' || s.charAt(right) == 'e' || s.charAt(right) == 'i' ||s.charAt(right) == 'o' ||s.charAt(right) == 'u' )
                vowel++;
            if(s.charAt(right-k) == 'a' || s.charAt(right-k) == 'e' || s.charAt(right-k) == 'i' ||s.charAt(right-k) == 'o' ||s.charAt(right-k) == 'u' )
                vowel--;
            max = Math.max(max, vowel);
        }
        
        return max;
        
    }
}