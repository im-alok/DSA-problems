from typing import List

class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        if not nums:
            return []
        
        res = []
        start = nums[0]  # Start of the current range

        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1] + 1:  # A gap is found
                if start == nums[i - 1]:
                    res.append(str(start))  # Single number
                else:
                    res.append(f"{start}->{nums[i - 1]}")  # Range
                start = nums[i]  # Start a new range
        
        # Add the last range
        if start == nums[-1]:
            res.append(str(start))
        else:
            res.append(f"{start}->{nums[-1]}")
        
        return res