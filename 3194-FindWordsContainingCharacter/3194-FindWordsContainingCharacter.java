// Last updated: 8/23/2025, 10:24:42 PM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n=words.length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(words[i].indexOf(x) != -1){
                ans.add(i);
            }
        }
        return ans;
    }
}