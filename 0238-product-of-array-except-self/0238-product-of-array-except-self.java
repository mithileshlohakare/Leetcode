class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Result array
        int[] ans = new int[n];

        // The first element has no elements to its left,
        // so its prefix product is 1.
        ans[0] = 1;

        // ---------------- Prefix Product ----------------
        // ans[i] stores the product of all elements
        // to the LEFT of index i.
        //
        // Example:
        // nums = [1,2,3,4]
        // ans  = [1,1,2,6]
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Variable to keep track of suffix product
        // (product of elements to the right).
        int suffix = 1;

        // ---------------- Suffix Product ----------------
        // Traverse from right to left.
        // Multiply the current prefix product stored in ans[]
        // with the suffix product.
        //
        // Example:
        // suffix values: 4 -> 12 -> 24
        // ans becomes: [24,12,8,6]
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];   // Update suffix product
            ans[i] *= suffix;        // Combine prefix and suffix
        }

        return ans;
    }
}