class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> s1 = new ArrayList<>();
        ArrayList<Integer> s2 = new ArrayList<>();

        int[] ans = new int[n];

        s1.add(nums[0]);
        s2.add(nums[1]);

        for (int i = 2; i < n; i++) {
            if (s1.get(s1.size() - 1) > s2.get(s2.size() - 1)) {
                s1.add(nums[i]);
            } else {
                s2.add(nums[i]);
            }
        }

        int index = 0;

        for (int num : s1) {
            ans[index++] = num;
        }

        for (int num : s2) {
            ans[index++] = num;
        }

        return ans;
    }
}