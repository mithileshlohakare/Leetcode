class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;

        long sum = 0;
        long total = 0;

        for (int i = 0; i < n; i++) {
            sum += 1L * i * nums[i];
            total += nums[i];
        }

        long ans = sum;

        for (int i = n - 1; i > 0; i--) {
            sum += total - 1L * n * nums[i];
            ans = Math.max(ans, sum);
        }

        return (int) ans;
    }
}