// Last updated: 9/27/2025, 10:38:09 AM
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String>pq=new PriorityQueue<>((a,b)->{
            if(a.length()!=b.length())
            {
                return a.length()-b.length();
            }
            else{
                return a.compareTo(b);
            }
        });
        for(String i:nums)
        {
            pq.add(i);
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        return pq.peek();
    }
}