// Last updated: 8/23/2025, 10:27:14 PM
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer>map=new HashSet();
        for(int m:arr)
        {
            if(map.contains(m*2) || ((m%2==0) && map.contains(m/2)))
            {
                return true;
            }
            map.add(m);
        }
        return false;

    }
}