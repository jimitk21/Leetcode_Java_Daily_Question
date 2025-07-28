// 2044. Count Number of Maximum Bitwise-OR Subsets


class Solution {

    int maxOrValue ;
    int count ;
    int nums[];

    public int countMaxOrSubsets(int[] nums) {
        maxOrValue = 0;
        for(int num : nums){
            maxOrValue |= num;
        }this.nums = nums;
        dfs(0,0);
        return count;

    }

    void dfs(int index,int currentOr){
        if(index == nums.length){
            if(currentOr == maxOrValue){
                count++;
            }
            return;
        }
  
        dfs(index + 1, currentOr);
 
        dfs(index + 1, currentOr | nums[index]);
    }
}