// Last updated: 8/23/2025, 10:29:05 PM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        ArrayList<Integer>ans1=new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if(hm.get(nums2[i])!=null)
            {
                ans1.add(nums2[i]);
                if(hm.get(nums2[i])==1)
                {
                    hm.remove(nums2[i]);
                }
                else{
                    hm.put(nums2[i],hm.get(nums2[i])-1);
                }
            }
        }
        int ans[]=new int[ans1.size()];
        for (int i = 0; i < ans1.size(); i++) {
            ans[i]=ans1.get(i);
        }
        return ans;
    }
}