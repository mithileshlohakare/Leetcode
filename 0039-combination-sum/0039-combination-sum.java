class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        make(candidates , target , 0 , new ArrayList<>() , 0 , ans);
        return ans;
    }
    private void make(int[] candidates , int target , int idx , List<Integer> ds , int total ,List<List<Integer>> ans){
        if(total == target){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(total >= target || idx >= candidates.length){
            return;
        }

        ds.add(candidates[idx]);
        make(candidates , target , idx  , ds , total + candidates[idx] , ans);
        ds.remove(ds.size() - 1);
        make(candidates , target , idx + 1 , ds , total  , ans);
    }
}