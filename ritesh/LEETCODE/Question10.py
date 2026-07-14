class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num <= 1:
            return False

        total = 1

        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                total += i
                if i != num // i:
                    total += num // i

        return total == num


obj = Solution()

print(obj.checkPerfectNumber(28))  # True
print(obj.checkPerfectNumber(7))   # False
print(obj.checkPerfectNumber(6))   # True