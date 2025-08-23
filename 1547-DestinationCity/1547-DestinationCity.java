// Last updated: 8/23/2025, 10:27:08 PM
class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String>hs=new HashSet<>();
        for(List<String> s:paths)
        {
            hs.add(s.get(0));
        }
        for(List<String> s:paths)
        {
            if(!hs.contains(s.get(1)))
            {
                return s.get(1);
            }
        }
        return "";
    }
}