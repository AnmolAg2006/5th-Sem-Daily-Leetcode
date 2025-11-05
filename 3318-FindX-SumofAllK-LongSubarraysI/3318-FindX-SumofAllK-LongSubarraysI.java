// Last updated: 11/5/2025, 11:21:15 AM
class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        for(int i=0;i<n-k+1;i++)
        {
            ans[i]=fun(nums,i,i+k,x);
        }
        return ans;
    }
    static class Pair{
        int x;
        int f;
        public Pair(int x,int f)
        {
            this.x=x;
            this.f=f;
        }
    }
    public static int fun(int nums[],int l,int r,int x)
    {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=l;i<r;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair>pq=new PriorityQueue<>((b,a)->{
            if(a.f==b.f)
            {
                return b.x-a.x;
            }
            return b.f-a.f;
        });
        for(int i:hm.keySet())
        {
            pq.add(new Pair(i,hm.get(i)));
            if(pq.size()>x) {
                pq.poll();
            }
        }
        int sum=0;
        while(!pq.isEmpty())
        {
            Pair curr=pq.poll();
            sum+=curr.x*curr.f;
        }
        return sum;

    }
}