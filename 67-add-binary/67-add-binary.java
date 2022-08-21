class Solution {
    public String addBinary(String a, String b) {
        
        int len_a = a.length() - 1;
        int len_b = b.length() - 1;
    
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        
        
        while(len_a >=0 || len_b>=0)
        {
            
            int curr =  carry;
            
            if(len_a>=0)
            {
                curr += Character.getNumericValue(a.charAt(len_a--));
            }
            
                        
            if(len_b>=0)
            {
                curr += Character.getNumericValue(b.charAt(len_b--));
            }
            
            if(curr == 0)
            {
                sb.append('0');
                carry = 0;
            }
            else if(curr == 1)
            {
                sb.append('1');
                carry = 0;

            }
            else if(curr == 2)
            {
                sb.append('0');
                carry = 1;
            }
            else if(curr == 3)
            {
                sb.append('1');
                carry = 1;
            }
        }
        
        if(carry == 1)
            sb.append('1');
        
        
        return sb.reverse().toString();

        
        
    }
}