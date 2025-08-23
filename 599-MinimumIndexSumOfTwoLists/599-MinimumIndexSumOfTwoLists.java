// Last updated: 8/23/2025, 10:28:19 PM
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer>hm=new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            hm.put(list1[i],i);
        }
        int min=Integer.MAX_VALUE;
        ArrayList<String>arr=new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if(hm.containsKey(list2[i]))
            {
                int indexSum=i+hm.get(list2[i]);
                if(indexSum<min)
                {
                    arr.clear();
                    min=indexSum;
                    arr.add(list2[i]);
                }
                else if(indexSum<=min)
                {

                    arr.add(list2[i]);
                }
            }
        }
        String ans[]=new String[arr.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i]=arr.get(i);
        }
        return ans;
    }
}