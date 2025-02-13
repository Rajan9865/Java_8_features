/**
 * 
 */
package durga.sir.lecture;

import java.util.Arrays;

/**
 * durga.sir.lecture
 *DelL
 */
class Solution {
    public int[] absDifference(String s) {
    	int n = s.length();
        int[] result = new int[n];
        int vowelCount = 0;
        int consonantCount = 0;
        
        // Set of vowels for quick lookup
        String vowels = "aeiou";
        
        // Iterate over the string
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            
            // Check if the character is a vowel
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            } else {
                consonantCount++;
            }
            
            // Compute the absolute difference and store it in the result array
            result[i] = Math.abs(vowelCount - consonantCount);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "geek";
        int[] result = solution.absDifference(s);
        System.out.println("Absolute Difference Array: " + Arrays.toString(result));
    }
}
