// Last updated: 8/25/2025, 11:21:47 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        List<List<Integer>> ans = new ArrayList<>();
        int n=mat.length;
        int m=mat[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j >= ans.size()) {
                    ans.add(new ArrayList<>());
                    
                }
                    ans.get(i + j).add(mat[i][j]);
                
            }
        }
        int arr[]=new int[n*m];
        int k=0;
        for (int i = 0; i < ans.size(); i++) {
            if(i%2!=0)
            {
                for (int j = 0; j < ans.get(i).size(); j++) {
                    arr[k++]=ans.get(i).get(j);
                }
            }
            else {
                for (int j = ans.get(i).size()-1; j>=0; j--) {
                    arr[k++]=ans.get(i).get(j);
                }

            }
        }
        System.out.print(arr);
        return arr;
    }
}