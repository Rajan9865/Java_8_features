package durga.sir.lecture;

import java.util.HashMap;

class Solution1 {
    public static int maxLength(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        
        // Calculate frequency of each number in the array
        for (int length : arr) {
            freqMap.put(length, freqMap.getOrDefault(length, 0) + 1);
        }
        
        // Find the smallest number that appears at least twice
        int result = Integer.MAX_VALUE;  // Initialize with a large value
        
        for (int length : freqMap.keySet()) {
            int count = freqMap.get(length);
            
            // If the number appears at least twice, check if it's the smallest
            if (count >= 2) {
                result = Math.min(result, length);
            }
        }
        
        return result == Integer.MAX_VALUE ? -1 : result;  // Return -1 if no number appears twice
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 5, 2, 5, 4, 2, 1};
        System.out.println("Max Fence Length (Test 1): " + maxLength(arr1));  // Expected Output: 3
    }
}
