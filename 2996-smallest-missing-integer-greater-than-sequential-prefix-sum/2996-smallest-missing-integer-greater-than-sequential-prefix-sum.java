class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        HashSet<Integer> sets = new HashSet<>();
        for(int num : nums){
            sets.add(num);
        }
        int sum = nums[0];
        for(int i = 1;i < n;i++){
            if(nums[i] == nums[i - 1] + 1){
                sum += nums[i];
            }else{
                break;
            }
        }
        while(sets.contains(sum)){
            sum++;
        }
        return sum;
    }
}