// Last updated: 8/23/2025, 10:27:12 PM
class Solution {
    public List<String> stringMatching(String[] words) {
        String str=String.join(" ",words);
        List<String> result=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(str.indexOf(words[i])!=str.lastIndexOf(words[i])){
                result.add(words[i]);
            }
        }
        return result;
    }
}