class Solution {
    public boolean isRobotBounded(String instructions) {
        
        int dirX = 0, dirY = 1, x = 0, y = 0, temp = 0;
        
        for(char ch : instructions.toCharArray())
        {
            if(ch == 'G')
            {
                x = x+dirX;
                y = y+dirY;
            }
            else if(ch == 'L')
            {
                temp = dirX;
                dirX = dirY;
                dirY = temp;
                dirX = (-1)*dirX;
            }
            else
            {
                temp = dirX;
                dirX = dirY;
                dirY = temp;
                dirY = (-1)*dirY;
            }
        }
        
        return ((x == 0) && (y == 0)) || ((dirX!=0) || (dirY!=1));
        
    }
}