class Solution {
    public String triangleType(int[] nums) {
        int a,b,c;
        a=nums[0];
        b=nums[1];
        c=nums[2];
        if((a+b)>c && (b+c)>a && (c+a)>b)
        {   if(a==b && b==c && c==a)
                return "equilateral";
            else if(a==b || b==c || c==a)
                return "isosceles";
            else
                return "scalene";
        }
        else
            return "none";
    }
}