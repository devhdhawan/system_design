class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            Collections.reverseOrder()
        );

        for(var n:nums) heap.add(n);

        int ans=0;
        while(k>0){
            k--;
            ans=heap.poll();
        }
        return ans;
    }
}