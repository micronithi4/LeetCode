class Solution {
    public int partitionString(String s) {
        int count=1;
        HashSet<Character>num=new HashSet<>();
        for(char c:s.toCharArray())
        {
            if(num.contains(c))
            {
                count++;
                num.clear();
            }
            
                num.add(c);
            
        }
        return count;
        
    }
}