public class MinimumEditDistance {
    public int minDistance(String word1, String word2) {
        return minDistanceRecursive(word1, word2, word1.length(), word2.length());
    }

    private int minDistanceRecursive(String word1, String word2, int m, int n) {
        // Base cases
        if (m == 0) {
            return n; // If word1 is empty, the only option is to insert all characters of word2
        }
        if (n == 0) {
            return m; // If word2 is empty, the only option is to delete all characters of word1
        }

        // If the last characters of the two strings are the same, ignore them and recurse for the remaining strings
        if (word1.charAt(m - 1) == word2.charAt(n - 1)) {
            return minDistanceRecursive(word1, word2, m - 1, n - 1);
        }

        // Otherwise, consider all three operations on the last character of word1,
        // recursively compute the minimum cost for all three operations and take the minimum
        return 1 + Math.min(Math.min(
                minDistanceRecursive(word1, word2, m, n - 1), // Insert
                minDistanceRecursive(word1, word2, m - 1, n)), // Remove
                minDistanceRecursive(word1, word2, m - 1, n - 1)); // Replace
    }

    public static void main(String[] args) {
        MinimumEditDistance solution = new MinimumEditDistance();
        String word1 = "horse";
        String word2 = "ros";
        int minOps = solution.minDistance(word1, word2);
        System.out.println("Minimum number of operations required: " + minOps); // Output: 3
    }
}
