// Last updated: 8/23/2025, 10:27:33 PM
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length];
        int j = 0;
        TreeMap<Integer, Integer> hm = new TreeMap();
        for (int i = 0; i < arr1.length; i++) {
            hm.put(arr1[i], hm.getOrDefault(arr1[i], 0) + 1);
        }
        // System.out.println(hm);
        for (int i = 0; i < arr2.length; i++) {
            while (hm.containsKey(arr2[i])) {
                ans[j++] = arr2[i];
                if (hm.get(arr2[i]) == 1) {
                    System.out.println(arr2[i]);
                    hm.remove(arr2[i]);
                } else {
                    hm.put(arr2[i], hm.get(arr2[i]) - 1);
                }
            }
        }
        for (int i : hm.keySet()) {
            int c=hm.get(i);
            while(c-->0)
            {
                ans[j++] = i;
            }
            // System.out.println(i);
        }
        return ans;
    }
}