class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0)
            return true;
        
        int l = 0, r = s.length() - 1;
        int c1, c2;
        
        while(l<r)
        {
            c1 = convert(s.charAt(l));
            c2 = convert(s.charAt(r));
            
            if( c1 == -1)
                l++;
            else if(c2 == -1)
                r--;
            else if(c1 != c2)
                return false;
            else
            {
                l++;
                r--;
            }
        }
        
        return true;
    }
    
    private int convert(char c)
    {
        if(c >= 'a' && c <= 'z')
            return c - 'a';
        else if(c >= 'A' && c <= 'Z')
            return c - 'A';
        else if(c >= '0' && c <= '9')
            return c;
        else
            return -1;
    }
}