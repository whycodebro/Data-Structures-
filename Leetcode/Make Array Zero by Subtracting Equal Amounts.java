class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> st = new HashSet<Integer>();
        for(int i : nums){
            if(i!=0){
                st.add(i);
            }
        }
        
        return st.size();
    }
}
