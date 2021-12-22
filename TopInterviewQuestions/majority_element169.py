class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        major = nums[0] - 1
        count = 1
        for num in nums:
            if major != num:
                count-= 1
                if count == 0:
                    major = num
                    count += 1
            else:
                count += 1
        return major