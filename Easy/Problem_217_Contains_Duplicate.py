class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        '''
        Convert the list into a set and then compare the 
        length of the original list and the new set.
        If they match, then there are no duplicate,
        otherwise there is a duplicate.'''

        return len(nums) != len(set(nums))