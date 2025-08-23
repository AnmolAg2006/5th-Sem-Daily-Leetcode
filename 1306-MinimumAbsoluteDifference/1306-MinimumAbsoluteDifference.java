// Last updated: 8/23/2025, 10:27:29 PM
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        List<List<Integer>> arr1 = new ArrayList<>();
        for(int i=0;i<n-1;i++)
        {
            ArrayList<Integer> row1 = new ArrayList<>();
            if(arr[i+1]-arr[i]==min)
            {
                row1.add(arr[i]);
                row1.add(arr[i+1]);
            }
            if(row1.size()!=0)
            {

                arr1.add(row1);
            }
        }
        return arr1;
    }
}