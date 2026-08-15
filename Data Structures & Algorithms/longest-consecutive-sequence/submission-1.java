class Solution {
    public int longestConsecutive(int[] nums) {
          if(nums.length==0)
        return 0;

        int max_count=0;
        int count=0;
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
           // count=1;
           if(i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }
            if(i > 0 && nums[i] == nums[i - 1] + 1) {
                count++;

            } else {

                count = 1;
            }
            if(count>max_count)
            {
                max_count=count;
            }
        }
        return max_count;
    }
}
