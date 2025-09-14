// Last updated: 9/14/2025, 2:11:50 PM
class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> evenMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> oddMaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Store the digits of the number and segregate even and odd digits
        String numStr = String.valueOf(num);
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            if (digit % 2 == 0) {
                evenMaxHeap.add(digit);
            } else {
                oddMaxHeap.add(digit);
            }
        }
        
        StringBuilder result = new StringBuilder();
        
        // Construct the largest integer by replacing digits with those from the heaps
        for (char ch : numStr.toCharArray()) {
            int digit = ch - '0';
            if (digit % 2 == 0) {
                result.append(evenMaxHeap.poll());
            } else {
                result.append(oddMaxHeap.poll());
            }
        }
        
        return Integer.parseInt(result.toString());
    }
}