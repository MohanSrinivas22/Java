class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
    }
}

/* *
Input: nums = [1,2,3,1]
Output: true

Input: nums = [1,2,3,4]
Output: false
*/
