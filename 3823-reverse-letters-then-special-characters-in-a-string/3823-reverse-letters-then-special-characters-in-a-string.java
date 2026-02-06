class Solution {
    public String reverseByType(String s) {
     StringBuilder letter = new StringBuilder ();
     StringBuilder special = new StringBuilder ();
     for(char ch :s.toCharArray())
     {
        if(Character.isLetter(ch))
        {
            letter.append(ch);
        }
        else
        {
            special.append(ch);
        }
     }
     letter.reverse();
     special.reverse();
     StringBuilder rev= new StringBuilder();
     int sp=0;
     int l=0;
     for(char ch :s.toCharArray())
     {
        
        if(Character.isLetter(ch))
        {
           rev.append( letter.charAt(l++));
        }
        else
        {
             rev.append( special.charAt(sp++));
        }
     }

return rev.toString();

    }
}
