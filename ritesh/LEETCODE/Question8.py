class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        result = 0

        for i in range(n):
            result ^= (start + 2 * i)

        return result


obj = Solution()

print(obj.xorOperation(5, 0))   # 8
print(obj.xorOperation(4, 3))   # 8
