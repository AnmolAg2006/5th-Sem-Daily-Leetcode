// Last updated: 9/27/2025, 10:29:25 AM
class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        int total = 0;
        for(int stone : piles) {
            total += stone;
            maxHeap.add(stone);
        }

        for(int i = 0; i < k; i++)
        {
            int pile = maxHeap.remove();
            int remove = pile / 2;
            total -= remove;
            maxHeap.add(pile - remove);
        }

        return total;
    }
}