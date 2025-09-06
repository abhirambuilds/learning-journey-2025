class Solution {
    public char findTheDifference(String s, String t) {
        char b[]=s.toCharArray();
        char c[]=t.toCharArray();
        Arrays.sort(b);
        Arrays.sort(c);
        for(int i=0;i<s.length();i++)
        {   if(b[i]!=c[i])
            return c[i];
        }
        return c[t.length()-1];
    }
}