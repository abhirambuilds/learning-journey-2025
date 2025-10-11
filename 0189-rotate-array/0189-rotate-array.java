class Solution {
    public void rotate(int[] nums, int k) {
        if (nums==null) return;
        int n=nums.length;
        if (n<=1) return;
        k=k%n;
        if (k==0) return;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public void reverse(int []arr ,int l,int r)
    {   while(l<r)
        {   int t=arr[l];
            arr[l++]=arr[r];
            arr[r--]=t;
        }
    }
}