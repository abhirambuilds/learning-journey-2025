class Solution {
    public boolean judgeCircle(String moves) {
        if(moves==null || moves.isEmpty()) return true;
        int x=0;
        int y=0;
        char[] arr=moves.toCharArray();
        for(char ch:arr)
        {   if(ch=='R') x++;
            else if(ch=='L') x--;
            else if(ch=='U') y++;
            else if(ch=='D') y--;
        }
        return (x==0 && y==0);
    }
}