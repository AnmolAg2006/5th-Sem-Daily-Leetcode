// Last updated: 10/27/2025, 1:23:19 PM
class Solution {
    public int numberOfBeams(String[] bank) {
        int total = 0;
        int curr = 0;
        for (String row : bank){
            int now =0;
            for (char ans : row.toCharArray() ){
                if (ans == '1'){
                    now++;
                }
            }
            if (now >0){
            total += curr * now;
            curr = now;
            }
        }
        return total;
    }
}