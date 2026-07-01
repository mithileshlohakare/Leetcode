class Solution {
    public int removePalindromeSub(String s) {
        return isPalindrome(s) ? 1 : 2;
    }
    private boolean isPalindrome(String s){
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}