public class ArraySum {
    public int arraySum(int[] arr) {
        return arraySumRecursive(arr, 0);
    }

    private int arraySumRecursive(int[] arr, int index) {
        // Base case: if index reaches the end of the array, return 0
        if (index == arr.length) {
            return 0;
        }
        
        // Recursive case: add the current element to the sum of the rest of the array
        return arr[index] + arraySumRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        ArraySum solution = new ArraySum();
        int[] arr = {92, 23, 15, -20, 10};
        int sum = solution.arraySum(arr);
        System.out.println("Sum of the values of the array: " + sum); // Output: 120
    }
}
