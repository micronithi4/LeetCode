class Solution {
    public String reversePrefix(String s, int k) {
        char word[]=s.toCharArray();
        int st=0;
        while(st<k)
        {
            char temp=word[st];
            word[st]=word[k-1];
            word[k-1]=temp;
            st++;
            k--;
        }
        return new String(word);
    }
}