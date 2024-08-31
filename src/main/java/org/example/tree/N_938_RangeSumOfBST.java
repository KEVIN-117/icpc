package org.example.tree;

public class N_938_RangeSumOfBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        if (root.val < low)
            return rangeSumBST(root.right, low, high);
        if (root.val > high)
            return rangeSumBST(root.left, low, high);
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(18);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.right = node5;

        N_938_RangeSumOfBST rangeSumOfBST = new N_938_RangeSumOfBST();
        System.out.println(rangeSumOfBST.rangeSumBST(root, 7, 15));
    }
    static
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}

