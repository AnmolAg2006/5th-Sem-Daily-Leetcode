// Last updated: 8/23/2025, 10:30:32 PM
import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        perm.clear(); // Clear previous results to avoid duplicate entries
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
            perm.add(new ArrayList<>(ans)); // Store a new copy of ans
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
