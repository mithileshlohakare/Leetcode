class Solution {
    public int maxDepth(String s) {
        int maxi =0;
        int cnt = 0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '('){
                cnt++;
                maxi = Math.max(cnt,maxi);
            }
            if(s.charAt(i) == ')'){
                cnt = cnt - 1;
            }
        }
        return maxi;
    }
}