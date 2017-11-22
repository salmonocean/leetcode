package com.leetcode.algorithm._133;

import com.leetcode.data.UndirectedGraphNode;

import java.util.HashMap;

/**
 * @see https://leetcode.com/problems/clone-graph/description/
 * Tag: DFS
 * Tag: BFS
 */
public class CloneGraph {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null)
            return null;
        HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();
        return dfs(map, node);
    }

    private UndirectedGraphNode dfs(HashMap<Integer, UndirectedGraphNode> map, UndirectedGraphNode node) {
        UndirectedGraphNode newNode = new UndirectedGraphNode(node.label);
        map.put(node.label, newNode);

        for (UndirectedGraphNode ugn : node.neighbors) {
            if (!map.containsKey(ugn.label)) {
                dfs(map, ugn);
            }

            newNode.neighbors.add(map.get(ugn.label));
        }

        return newNode;
    }
}
