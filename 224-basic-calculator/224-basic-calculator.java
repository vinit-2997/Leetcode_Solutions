class Solution {
    public int calculate(String s) {
        s.replaceAll(" ", "");
        char[] ch = s.toCharArray();
        StringBuilder cur = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int curr = 1;
        int ans = 0;
        int sign = 1;
        
        for(int i = 0; i<s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                cur.append(s.charAt(i));
                
                while((i+1)<s.length() && Character.isDigit(s.charAt(i+1)))
                {
                    cur.append(s.charAt(++i));
   
                }
                
                    ans += (Integer.valueOf(cur.toString())) * sign;
                    cur.setLength(0);
            }
            if(s.charAt(i) == '+')
            {
                
                sign = 1;
            }
            else if(s.charAt(i) == '-')
            {
                // ans += (Integer.valueOf(cur.toString())) * sign;
                // cur.setLength(0);
                sign = -1;
            }
            else if(s.charAt(i) == '(')
            {
                stack.push(ans);
                stack.push(sign);
                ans = 0;
                sign = 1;
            }
            else if(s.charAt(i) == ')')
            {
                int prevsign = stack.pop();
                ans*= prevsign;
                ans += stack.pop() ;
               
            }
            else
                continue;
        }
        
        return ans;
        
    }
}