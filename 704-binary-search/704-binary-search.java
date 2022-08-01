import java.util.Scanner;
class Solution {
    public int search(int[] nums, int target) {
        for (int j=0; j< nums.length; j++){
            if(target == nums[j]){
                return j;
            }
        }
        return -1;
    }
}

