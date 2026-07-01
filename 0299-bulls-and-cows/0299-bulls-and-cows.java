class Solution {
    public String getHint(String secret, String guess) {
        int n = secret.length();
        int bulls = 0;
        int cows = 0;
        int[] count = new int[10];
        for(int i = 0;i < n;i++){
            char s = secret.charAt(i);
            char g = guess.charAt(i);

            if(s == g){
                bulls++;
            }else{
                int si = s - '0';
                int gi = g - '0';

                if(count[si] < 0) cows++;
                if(count[gi] > 0) cows++;
                count[si]++;
                count[gi]--;
            }
            
        }
        StringBuilder sb = new StringBuilder();
            sb.append(bulls);
            sb.append('A');
            sb.append(cows);
            sb.append('B');
            return sb.toString();
    }
}