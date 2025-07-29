// 2411. Smallest Subarrays With Maximum Bitwise OR


import java.util.Arrays;

class Solution {

    public int[] smallestSubarrays(int[] nums) {

        int length = nums.length;

        int[] answer = new int[length];

        int[] latestOneBitIndices = new int[32];

        Arrays.fill(latestOneBitIndices, -1);

        for (int i = length - 1; i >= 0; --i) {

            int subarraySize = 1;

            for (int j = 0; j < 32; ++j) {

                if (((nums[i] >> j) & 1) == 1) {

                    latestOneBitIndices[j] = i;

                } else if (latestOneBitIndices[j] != -1) {

                    subarraySize = Math.max(subarraySize, latestOneBitIndices[j] - i + 1);

                }

            }

            answer[i] = subarraySize;

        }

        return answer;

    }

}