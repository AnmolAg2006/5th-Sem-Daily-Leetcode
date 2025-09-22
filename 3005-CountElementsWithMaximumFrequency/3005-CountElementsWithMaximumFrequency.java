// Last updated: 9/22/2025, 10:44:47 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=-1;
        int sum=0;
        System.out.println(hm);
        for(int i:hm.keySet())
        {
            if(hm.get(i)>max)
            {
                sum=hm.get(i);
                max=hm.get(i); 
                continue;
            }
            if(hm.get(i)==max)
            {
                System.out.print(i+" ");
                sum+=max;
            }
            
        }
        
        return sum;
    }
}