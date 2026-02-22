class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
        int sl=s.length();
        int pl=p.length();
        char chs[]=s.toCharArray();
        char chp[]=p.toCharArray();
        Arrays.sort(chp);
        for(int i =0;i<=sl-pl;i++)
        {
        

        char ch[]=s.substring(i,i+pl).toCharArray();
        Arrays.sort(ch);
        if(Arrays.equals(ch,chp))
        {
            list.add(i);
        }
        }
        return list;
        
    }

}