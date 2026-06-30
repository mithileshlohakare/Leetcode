class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        int ele = -1;
        for(int i = 0;i < n;i++){
            if(cnt == 0){
                ele = nums[i];
                cnt = 1;
            }else if(ele == nums[i]){
                cnt++;
            }else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i = 0;i < n;i++){
            if(ele == nums[i]){
                cnt1++;
            }
        }
        if(cnt1 > n/2){
            return ele;
        }
        return -1;
    }
}