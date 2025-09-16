// Last updated: 9/16/2025, 9:43:22 AM
class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        TreeMap<Integer,ArrayList<Integer>>hm=new TreeMap<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            // if(hm.containsKey(groupSizes[i]))
            // {
                ArrayList<Integer>temp=hm.getOrDefault(groupSizes[i],new ArrayList<>());
                temp.add(i);
                hm.put(groupSizes[i],temp);

            // }else{
            //     ArrayList<Integer>temp=new ArrayList<>();
            //     temp.add(i);
                

            // }
        }
        System.out.println(hm);
        List<List<Integer>> ans=new ArrayList<>();
        for(int key:hm.keySet())
        {
            ArrayList<Integer>arr=hm.get(key);
            // new ArrayList<>();
            for(int i=0;i<arr.size();i+=key)
            {
                ans.add(arr.subList(i,i+key));

            }
        }
        return ans;
    }
}