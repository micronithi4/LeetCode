class Solution {
    public boolean isPalindrome(int x) {

        int n=x;
        if(n<0)return false;
         int str=0;
        while(n!=0)
        {
            int d=n%10;
            str=str*10+d;
            n=n/10;

        }
        if(str==x)
        {
            return true;
        }
    
        
        return false;
        
    }
}