// Last updated: 8/23/2025, 10:27:59 PM
class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String arr[]={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       Set<String> hm = new HashSet<>();
        for(int i=0;i<words.length;i++)
        {
            StringBuilder str=new StringBuilder();
            for(int j=0;j<words[i].length();j++)
            {
                str.append(arr[words[i].charAt(j)-'a']);
            }
            hm.add(str.toString());
        }
        return hm.size();
    }
}