class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> count=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            count.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(count.containsKey(target-nums[i]) && count.get(target-nums[i])!=i)
            {
                int arr[]={i,count.get(target-nums[i])};
                return arr;
            }
        }
        return null;
    }
}
