class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for(int i : stones){
            pq.add(i);
        }
        
        Iterator it = pq.iterator();
        
        while(it.hasNext()){
            
            if(pq.size() == 1){
                return pq.peek();
            }
            
            int a = pq.poll();
            int b = pq.poll();
            
       
            
            if(a>b){
                a = a-b;
                pq.add(a);
            }else{
                b = b-a;
                pq.add(b);
            }
        }
        return 0;
    }
}
