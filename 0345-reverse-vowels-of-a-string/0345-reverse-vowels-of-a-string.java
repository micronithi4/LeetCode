class Solution {
    public String reverseVowels(String s) {
     char []word =s.toCharArray();
     int st =0;
     int la=s.length()-1;

     while(st<la)
     {
        if("aeiouAEIOU".indexOf(word[st]) != -1&&"aeiouAEIOU".indexOf(word[la])!= -1)
        {
            char temp=word[st];
            word[st]=word[la];
            word[la]=temp;
            st++;
            la--;

        }
        else if("aeiouAEIOU".indexOf(word[st]) ==-1)
        {
            st++;
        }
        else
        {
            la--;
        }
     }
     return new String(word);
    
    }
}