// Time Complexity : O(log n) where n is the number of elements in input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach


class MininRotatedSortedArray {
    public int findMin(int[] nums) {

        //null check
        if(nums == null || nums.length == 0){
            return -1;
        }

        int low = 0;
        int high = nums.length -1 ;


        while(low <= high){

            int mid = low + (high-low)/2;

            //check if array is already sorted
            if(nums[low] < nums[high]){
                return nums[low];
            }

            //check if mid is the minimum element
            if((mid == 0 || nums[mid] < nums[mid-1]) && (mid == nums.length -1 || nums[mid] < nums[mid+1])){
                return nums[mid];
            }

            else if(nums[low] <= nums[mid]){
                low = mid+1;
            }

            else {
                high = mid -1;
            }
        }
        return -1;
    }
}