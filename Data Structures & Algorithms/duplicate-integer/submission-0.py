class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen_set=set()
        for num in nums:
            seen_set.add(num)

        if(len(seen_set)==len(nums)):
            return False

        else:
            return True