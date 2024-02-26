class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base cases:
        // If both trees are null, they are identical
        if (p == null && q == null) {
            return true;
        }
        // If one of the trees is null and the other is not, they are not identical
        if (p == null || q == null) {
            return false;
        }
        // If the values at the current nodes are different, they are not identical
        if (p.val != q.val) {
            return false;
        }

        // Recursively check the left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        SameTree solution = new SameTree();

        // Example usage:
        // Construct two trees
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        // Check if the trees are the same
        boolean result = solution.isSameTree(tree1, tree2);
        System.out.println("Are the trees the same? " + result);
    }
}
