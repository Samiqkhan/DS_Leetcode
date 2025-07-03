class Solution 
{
    public boolean isPalindrome(String s) 
    {
        int start = 0;
        int e= s.length() - 1;
        while(start < e)
        {
            if(Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(e)))
            {
                if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(e))) return false;
                start = start+1;
                e = e-1;
            }
            else if(Character.isDigit(s.charAt(start)) && Character.isDigit(s.charAt(e)))       {
                if(s.charAt(start) != s.charAt(e)) return false;
                    start = start + 1;
                    e = e-1;
            }
            else if(!Character.isDigit(s.charAt(start)) && !Character.isLetter(s.charAt(start)))
            {
                
                start = start +1;
            }
            else if(!Character.isDigit(s.charAt(e)) && !Character.isLetter(s.charAt(e)))       {
                e = e-1;
            }
            else
                return false;
        }
        return true;
    }
}
