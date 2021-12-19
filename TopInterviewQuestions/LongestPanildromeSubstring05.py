class Solution(object):

    def checkOutside(self, s, left, right):
        while left >= 0 and right <= len(s) - 1 and s[left] == s[right]:
            left -= 1
            right += 1
        left += 1
        right -= 1
        return s[left:right + 1]

    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        maxword = ""
        for i in range(0, len(s)):
            word1 = self.checkOutside(s, i, i + 1)
            word2 = self.checkOutside(s, i, i)
            word = word1 if len(word1) > len(word2) else word2
            if len(word) > len(maxword):
                maxword = word

        return maxword

