// Last updated: 9/16/2025, 9:54:06 AM
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        List<List<Integer>> ans = new ArrayList<>();

        while (!hm.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> toRemove = new ArrayList<>();

            for (int i : hm.keySet()) {
                temp.add(i);
                hm.put(i, hm.get(i) - 1);
                if (hm.get(i) == 0) {
                    toRemove.add(i); 
                }
            }

            for (int i : toRemove) {
                hm.remove(i);
            }

            ans.add(temp); 
        }

        return ans;
    }
}
