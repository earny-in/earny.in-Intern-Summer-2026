class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        return num == 0 or num % 10 != 0


obj = Solution()

print(obj.isSameAfterReversals(526))   # True
print(obj.isSameAfterReversals(1800))  # False
print(obj.isSameAfterReversals(0))     # True