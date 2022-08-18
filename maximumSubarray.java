class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=-99999, currsum=0, n=nums.length;
        for(int i=0; i<n; i++){
            currsum += nums[i];
            maxsum = Math.max(maxsum, currsum);
            currsum = Math.max(currsum, 0);
        }
        return maxsum;
    }
}

/* *

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Input: nums = [5,4,-1,7,8]
Output: 23

Input: nums = [1]
Output: 1

*/
