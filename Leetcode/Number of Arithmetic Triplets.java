class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        //int i =2;
        //int j=i-2;
        int n= nums.length;
        int count=0;
        
        for(int i=1;i<n-1;i++){
            for(int j=0;j<i;j++){
                int x = nums[i]-nums[j];
                if(x==diff){
                    for(int k=i+1;k<n;k++){
                        if(nums[k] - nums[i] == x){
                            count++;
                        }
                    }
                }
                
            }
        }
        return count;
    }
}
