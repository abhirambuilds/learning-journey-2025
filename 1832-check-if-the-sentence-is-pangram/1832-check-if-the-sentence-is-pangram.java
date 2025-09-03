class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] a=sentence.toCharArray();
        Arrays.sort(a);
        int unq=1;
        for(int i=1;i<a.length;i++)
        {   if(a[i]!=a[i-1])
                unq++;
        }
        return (unq>=26) ? true:false;
    }
}