class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++)
        {
            if(i<k){
                heap.add(nums[i]);
            }else{
                if(nums[i]>heap.peek()){
                    heap.remove();
                    heap.add(nums[i]);
                }
            }
        }
        return heap.peek();
    }
}