import java.lang.*;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder a=new StringBuilder();
        for(char c: s.toCharArray())
        {   if(Character.isLetterOrDigit(c))
            {   a.append(Character.toLowerCase(c));
            }
        }
        String rev=new StringBuilder(a).reverse().toString();
        return a.toString().equals(rev);
    }
}