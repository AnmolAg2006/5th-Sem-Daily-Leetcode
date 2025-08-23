// Last updated: 8/23/2025, 10:30:31 PM
import java.util.*;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        perm.clear(); // Reset stored results for each test case
        List<Integer> ques = new ArrayList<>();

        // Convert int[] to List<Integer>
        for (int num : nums) {
            ques.add(num);
        }

        permutations(ques, new ArrayList<>());
        return perm;
    }

    private void permutations(List<Integer> ques, List<Integer> ans) {
        if (ques.isEmpty()) {
            if(!perm.contains(new ArrayList<>(ans)))
            {

            perm.add(new ArrayList<>(ans)); // Add a COPY of ans
            }
            return;
        }

        for (int i = 0; i < ques.size(); i++) {
            List<Integer> newList = new ArrayList<>(ques);
            List<Integer> newAns = new ArrayList<>(ans);

            newAns.add(ques.get(i));
            newList.remove(i);

            permutations(newList, newAns);
        }
    }

    private List<List<Integer>> perm = new ArrayList<>();
}
