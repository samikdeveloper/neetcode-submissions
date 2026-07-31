class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int prodLeft=1;
        int prodRight=1;
        /*for(int i=0;i<nums.length;i++)
        {
            output[i]=prodLeft;
            prodLeft=prodLeft*nums[i];
        }
        
         for(int i=nums.length-1;i>=0;i--)
        {
            output[i]=output[i]*prodRight;
            prodRight=prodRight*nums[i];
        }*/

        for(int i=nums.length-1;i>=0;i--)
        {

            ans[i]=prodRight;
            prodRight=prodRight*nums[i];

        }

        for(int i=0;i<nums.length;i++)
        {
            ans[i]=ans[i]*prodLeft;
            prodLeft=prodLeft*nums[i];


        }
        return ans;
    }
}  
