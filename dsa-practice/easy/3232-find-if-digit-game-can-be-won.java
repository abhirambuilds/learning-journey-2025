class Solution {
    public boolean canAliceWin(int[] nums) {
        int Ssum = 0;
        int Dsum = 0;
        for (int i : nums) {
            if(i<10)
            {   Ssum += i;
            }
            else
            {   Dsum += i;
            }
        } 
        return Dsum!=Ssum; 
    }
}