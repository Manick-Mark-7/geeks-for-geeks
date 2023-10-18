package geeks_for_geeks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Eventual_Safe_States_Oct_18 {
    List<Integer> eventualSafeNodes(int V, List<List<Integer>> adj) {

        List<Integer> safeNodes = new ArrayList<>();

        // Create an array to keep track of the state of each node:
        // 0: Not visited, 1: Visiting (in the process of exploration), 2: Safe
        int[] state = new int[V];

        // Step 1: Iterate through each node to check if it's an eventual safe node.
        for (int i = 0; i < V; i++) {
            if (isSafeNode(i, adj, state)) {
                safeNodes.add(i);
            }
        }

        // Step 2: Sort the eventual safe nodes and return them.
        Collections.sort(safeNodes);
        return safeNodes;
    }

    // Step 3: Recursive function to determine if a node is safe.
    private boolean isSafeNode(int node, List<List<Integer>> adj, int[] state) {
        // If the state is 0, the node has not been visited.
        if (state[node] != 0) {
            // If the state is 2, it's already determined to be safe.
            return state[node] == 2;
        }

        // Step 4: Mark the node as currently being visited (state 1).
        state[node] = 1;

        // Step 5: Explore neighbors of the current node.
        for (int neighbor : adj.get(node)) {
            if (!isSafeNode(neighbor, adj, state)) {
                return false;
            }
        }

        // Step 6: Mark the current node as safe (state 2).
        state[node] = 2;
        return true;
    }
}
