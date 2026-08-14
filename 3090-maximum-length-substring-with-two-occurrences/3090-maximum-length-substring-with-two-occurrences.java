class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxi = 0;
        int[] count = new int[26];
        for(int right = 0; right < n;right++){
            char rch = s.charAt(right);
            count[rch - 'a']++;
            while(count[rch - 'a'] > 2){
                char lch = s.charAt(left);
                count[lch - 'a']--;;
                left++;
            }
            maxi = Math.max(maxi , right - left + 1);
        }
        return maxi;
    }
}