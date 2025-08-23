// Last updated: 8/23/2025, 10:28:47 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        int [] num=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            num[nums[i]]=1;
        }
        for(int i=1;i<num.length;i++){
            if(num[i]!=1){
                list.add(i);
            }
        }
        return list;
    }
}