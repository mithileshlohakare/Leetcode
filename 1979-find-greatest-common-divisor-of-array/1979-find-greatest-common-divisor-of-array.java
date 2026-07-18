class Solution {
    public int findGCD(int[] nums) {
        int mini = nums[0];
        int maxi = nums[0];

        for (int num : nums) {
            mini = Math.min(mini, num);
            maxi= Math.max(maxi, num);
        }
        return gcd(mini,maxi);

    }
    int gcd(int a, int b) {
    if(b == 0) return a; 
    return gcd(b, a % b); 
    }
}