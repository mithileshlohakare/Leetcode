class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> arr = new ArrayList<>();
        int i = 0, j = 0, n1 = nums1.length, n2 = nums2.length;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                arr.add(nums1[i++]);
            }else{
                arr.add(nums2[j++]);
            }
        }
        while(i < n1) arr.add(nums1[i++]);
        while(j < n2) arr.add(nums2[j++]);

        int n = arr.size();
        if(n%2 != 0){
            return arr.get(n / 2);
        }

        return (arr.get(n / 2 - 1) + arr.get(n / 2)) / 2.0;
    }
}