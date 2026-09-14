class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int ans = 0;

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int idx = st.pop();

                int left = st.isEmpty() ? -1 : st.peek();
                int width = i - left - 1;

                ans = Math.max(ans, heights[idx] * width);
            }

            st.push(i);
        }

        while(!st.isEmpty()){
            int idx = st.pop();

            int left = st.isEmpty() ? -1 : st.peek();
            int width = n - left - 1;

            ans = Math.max(ans, heights[idx] * width);
        }

        return ans;
    }
}