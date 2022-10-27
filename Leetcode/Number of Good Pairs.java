class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i]) +1);
            }else{
                map.put(nums[i],1);
            }
        }
        int ans=0;
        
        Iterator it = map.entrySet().iterator();
        
        while(it.hasNext()){
            Map.Entry mapElement = (Map.Entry)it.next();
            int temp = (int)mapElement.getValue();
            if(temp>1){
                ans = ans + (temp*(temp-1))/2;                
                System.out.println(ans);
            }
        }
        return ans;
    }
}
