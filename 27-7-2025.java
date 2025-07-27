// 2210: Count Hills and Valleys in an Array

class Solution {
    public int countHillValley(int[] nums) {
        int ans = 0 ;
        int pivot = nums[0];

        for(int i = 1; i+ 1 <nums.length ; ++i){
            if((pivot <nums[i]  && nums[i] > nums[i+1]) || pivot > nums[i] && 
            nums[i]<nums[i+1] ){
                ++ans;
                pivot = nums[i];
            }
        }
        return ans;
    }
}