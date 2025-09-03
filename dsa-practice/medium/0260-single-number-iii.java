class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        int j=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++) {
            if(nums[i]==nums[i-1]) {
                i++;
            } else {
                res[j]=nums[i-1];
                j++;
                if(j==2) return res;
            }
        }
        if(j<2)
            res[j]=nums[nums.length-1];
        return res;
    }
}