class Solution {
    public int maxIceCream(int[] costs, int coins) {
        // wants to buy maximum no. of icecream bars
        Arrays.sort(costs);
        int cnt = 0;
        for(int i = 0;i < costs.length;i++){
            if(coins >= costs[i]){
                coins -= costs[i];
                cnt++;
            }
        }
        return cnt;
    }
}