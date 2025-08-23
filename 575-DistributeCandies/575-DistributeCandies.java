// Last updated: 8/23/2025, 10:28:24 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer>hs=new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            hs.add(candyType[i]);
        }
        if(hs.size()>=candyType.length/2){
            return candyType.length/2;
        }
        return hs.size();
    }
}