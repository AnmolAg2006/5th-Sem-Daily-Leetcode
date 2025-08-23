// Last updated: 8/23/2025, 10:29:44 PM
class Solution {
    public String largestNumber(int[] nums) {
        String str[]=new String[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            str[i]=Integer.toString(nums[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        StringBuilder ans =new StringBuilder();
        if(str[0].equals("0"))
    return "0";
        for(String s:str)
        {
            ans.append(s);
        }
        return ans.toString();
    }
}