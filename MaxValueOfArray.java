public class MaxValueOfArray {
    public int findMax(int[] nums) {
        return findMaxRecursive(nums, 0, nums.length - 1);
    }
    
    private int findMaxRecursive(int[] nums, int left, int right) {
        // Base case: If the array has only one element, return that element
        if (left == right) {
            return nums[left];
        }
        
        // Find the middle index
        int mid = left + (right - left) / 2;
        
        // Recursively find the maximum value of the left and right halves
        int maxLeft = findMaxRecursive(nums, left, mid);
        int maxRight = findMaxRecursive(nums, mid + 1, right);
        
        // Return the maximum value between the maximum values of the left and right halves
        return Math.max(maxLeft, maxRight);
    }
    
    public static void main(String[] args) {
        MaxValueOfArray solution = new MaxValueOfArray();
        int[] nums = {13, 1, -3, 22, 5};
        int max = solution.findMax(nums);
        System.out.println("Max value of the array: " + max); // Output: 22
    }
}
