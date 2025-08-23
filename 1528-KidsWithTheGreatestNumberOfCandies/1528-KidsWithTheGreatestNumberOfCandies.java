// Last updated: 8/23/2025, 10:27:10 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int i:candies){
             max=Math.max(max,i);
        }
        ArrayList<Boolean>list=new ArrayList<>(candies.length);
        for(int j:candies){
            if(j+extraCandies>=max)
            list.add(true);
            else
            list.add(false);
        }
        return list;
        
        
    }
}