class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1=0;   
        int count2=0;
        for(int num:nums)
        {   if(num==1)
            {   count1++;
                count2=Math.max(count1,count2);
            }
            else
            {   count1=0;
            }
        }
        return count2;
    }
}