# class Solution:
#     def sortColors(self, nums: List[int]) -> None:
#         """
#         Do not return anything, modify nums in-place instead.
#         """
#         ones = 0
#         twos = 0
#         threes = 0
#         for num in nums:
#             if num == 0:
#                 ones+=1
#             elif num == 1:
#                 twos += 1
#             elif num ==2:
#                 threes += 1

#         for i in range(len(nums)):
#             if ones != 0:
#                 ones-=1
#                 nums[i] = 0
#             elif twos != 0:
#                 twos -=1
#                 nums[i] = 1
#             else:
#                 threes -=1
#                 nums[i] = 2


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Dutch National Flag problem solution.
        """
        # for all idx < p0 : nums[idx < p0] = 0
        # curr is an index of element under consideration
        p0 = curr = 0
        # for all idx > p2 : nums[idx > p2] = 2
        p2 = len(nums) - 1

        while curr <= p2:
            if nums[curr] == 0:
                nums[p0], nums[curr] = nums[curr], nums[p0]
                p0 += 1
                curr += 1
            elif nums[curr] == 2:
                nums[curr], nums[p2] = nums[p2], nums[curr]
                p2 -= 1
            else:
                curr += 1

