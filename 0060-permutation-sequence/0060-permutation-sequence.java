class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        
        int f = 1;
        for(int i = 1;i < n;i++){
            f = f * i;
        }
        for(int i = 1;i <= n;i++){
            numbers.add(i);

        }
        k--;
        StringBuilder sb = new StringBuilder();

        while(true){
            int index = k / f;
            sb.append(numbers.get(index));
            numbers.remove(index);

            if (numbers.size() == 0) break;

            k = k % f;
            f = f / numbers.size();
        }
        return sb.toString();
    }
}