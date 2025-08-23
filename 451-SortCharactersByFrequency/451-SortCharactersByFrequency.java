// Last updated: 8/23/2025, 10:28:46 PM
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> h= new HashMap<>();
        for(char c:s.toCharArray())
        {
            h.put(c,h.getOrDefault(c,0)+1);
        }
        List<Character> sortedChars = new ArrayList<>(h.keySet());
        Collections.sort(sortedChars, (a, b) -> h.get(b) - h.get(a));
        StringBuilder ans = new StringBuilder();
        for(char i:sortedChars)
        {
            int j=h.get(i);
            while(j--!=0)
            {
                ans.append(i);
            }
        }
        return ans.toString();
    }
}