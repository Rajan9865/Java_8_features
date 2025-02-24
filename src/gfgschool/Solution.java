/**
 * 
 */
package gfgschool;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * gfgschool
 *DelL
 */

import java.util.*;

class Solution {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private String s; // String representing the color of each node
    private int n; // Number of nodes
    private int longestPathLength = 0; // To store the length of the longest valid path

    public int longestPath(String s, int[][] edges) {
        this.s = s;
        this.n = s.length();
        
        // Build the graph from the edges
        for (int[] edge : edges) {
            int u = edge[0] - 1; // Adjusting to 0-based indexing
            int v = edge[1] - 1; // Adjusting to 0-based indexing
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // Initialize visited array to track visited nodes during DFS
        boolean[] visited = new boolean[n];
        
        // Start DFS from every node
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, -1, 0, visited); // Start DFS from this node, with no parent and 0 length
            }
        }
        
        return longestPathLength;
    }

    // DFS to explore the graph and find the longest path based on color constraints
    private void dfs(int node, int parent, int length, boolean[] visited) {
        // Mark this node as visited
        visited[node] = true;
        
        // Update the longest path length
        longestPathLength = Math.max(longestPathLength, length);
        
        // Explore all neighbors
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            // Skip the parent node (avoid cycles)
            if (neighbor == parent) continue;
            
            // Get the current node's color and the next node's color
            char currColor = s.charAt(node);
            char nextColor = s.charAt(neighbor);
            
            // If the current node is Blue, we can only go to Blue nodes
            if (currColor == 'B') {
                if (nextColor == 'B' && !visited[neighbor]) {
                    dfs(neighbor, node, length + 1, visited); // Continue DFS to Blue nodes only
                }
            } else {
                // If the current node is Red, we can go to both Red and Blue nodes
                if (!visited[neighbor]) {
                    dfs(neighbor, node, length + 1, visited);
                }
            }
        }
        
        // Backtrack: Mark this node as unvisited to allow other paths
        visited[node] = false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "RBB"; // Node 1 is Red, Node 2 and 3 are Blue
        int[][] edges = {{1, 2}, {1, 3}}; // Edges between nodes
        System.out.println(solution.longestPath(s, edges)); // Expected Output: 2
    }
}

