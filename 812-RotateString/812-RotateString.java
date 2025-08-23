// Last updated: 8/23/2025, 10:28:00 PM
class Solution {
    public boolean rotateString(String s, String goal) {
      if (s.length() != goal.length()) {
            return false;
        }
        String doubledS = s + s;
        return doubledS.contains(goal);  
    }
}