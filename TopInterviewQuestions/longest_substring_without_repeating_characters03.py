class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """

        max_len = 0
        dict = {}
        last_index = 0
        for i, l in enumerate(s):
            if l in dict:
                ## following if condition is very important
                if dict[l] >= last_index:
                    last_index = dict[l] + 1
            llen = i - last_index + 1
            max_len = max(max_len, llen)
            dict[l] = i
        return max_len