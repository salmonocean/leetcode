package algorithm.lowestCommonAncestorOfBinarySearchTree;

import algorithm.TreeNode;

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int min, max;
        if (p.val > q.val) {
            max = p.val;
            min = q.val;
        } else {
            max = q.val;
            min = p.val;
        }

        TreeNode candidate = root;
        while (candidate != null) {
            if (candidate.val > max) {
                candidate = candidate.left;
            } else if (candidate.val < min) {
                candidate = candidate.right;
            } else {
                return candidate;
            }
        }

        return null;
    }
}
