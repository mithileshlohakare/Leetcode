class Solution {
    public int largestAltitude(int[] gain) {
        int maxi = 0;
        int curr =0;
        for(int num : gain){
            curr += num;
            maxi = Math.max(maxi,curr);
        }
        return maxi;
    }
}