package org.example.tree;

public class N_1379_FindCorrespondingNodeBinaryTreeCloneThatTree {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null)
            return null;
        if (original == target)
            return cloned;
        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        if (left != null)
            return left;
        return getTargetCopy(original.right, cloned.right, target);
    }

    public static void main(String[] args) {
        TreeNode original = new TreeNode(7);
        TreeNode node1 = new TreeNode(4);
        TreeNode node2 = new TreeNode(3);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(19);

        original.left = node1;
        original.right = node2;
        node2.left = node3;
        node2.right = node4;

        TreeNode cloned = new TreeNode(7);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(3);
        TreeNode node7 = new TreeNode(6);
        TreeNode node8 = new TreeNode(19);

        cloned.left = node5;
        cloned.right = node6;
        node6.left = node7;
        node6.right = node8;

        TreeNode target = new TreeNode(3);

        N_1379_FindCorrespondingNodeBinaryTreeCloneThatTree findCorrespondingNodeBinaryTreeCloneThatTree = new N_1379_FindCorrespondingNodeBinaryTreeCloneThatTree();
        System.out.println(findCorrespondingNodeBinaryTreeCloneThatTree.getTargetCopy(original, cloned, target).val);
    }
    public static class TreeNode {
        protected int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int x) { val = x; }
    }
}


