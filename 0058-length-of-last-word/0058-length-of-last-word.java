class Solution {
    public int lengthOfLastWord(String s) {

String arr[] = s.split(" ");
int len=arr.length;

String n =arr[len-1];

int slen=n.length();

return slen;


    }
}