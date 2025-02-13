/**
 * 
 */
package durga.sir.lecture;

/**
 * durga.sir.lecture
 *DelL
 */
class Solution2 {

    public static int minCharacter(String s, String t) {
        int n = s.length();
        int m = t.length();
        int minDeletions = n;  // In the worst case, we need to delete all characters of s.

        // Try to match s as a subsequence of t starting from different positions in t.
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;  // If characters match, move to the next character in s
            }
            j++;  // Always move forward in t
        }

        // If we matched all characters of s in t, the number of deletions needed is n - i
        if (i == n) {
            minDeletions = n - i;
        }

        return minDeletions;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        // Test case 1: s = "abc", t = "abcbc"
        String s1 = "abc";
        String t1 = "abcbc";
        System.out.println("Example 1 Result: " + minCharacter(s1, t1)); // Expected output: 0

        // Test case 2: s = "geeks", t = "geek"
        String s2 = "geeks";
        String t2 = "geek";
        System.out.println("Example 2 Result: " + minCharacter(s2, t2)); // Expected output: 1
    }
}
