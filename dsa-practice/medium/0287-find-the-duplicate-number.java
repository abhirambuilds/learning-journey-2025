class Solution {
    public int findDuplicate(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<l;i++)
        {   if(nums[i-1]==nums[i])
            return nums[i-1];
        }
        return 0;
    }
}