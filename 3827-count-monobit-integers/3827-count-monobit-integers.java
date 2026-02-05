class Solution {
    public int countMonobit(int n) {
        int s =(int)(Math.log(n+1)/Math.log(2));
        return s+1;
        
    }
}