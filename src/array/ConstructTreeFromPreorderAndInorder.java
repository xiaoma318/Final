package array;

/**
 * Created by chengma on 7/29/15.
 */
public class ConstructTreeFromPreorderAndInorder {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, preorder.length - 1);
    }

    static TreeNode helper(int[] pre, int[] in, int index, int left, int right) {
        if (left > right) return null;
        int rootValue = pre[index];
        TreeNode root = new TreeNode(rootValue);
        int i = left;
        for (; i <= right; i++) {
            if (in[i] == rootValue)
                break;
        }
        root.left = helper(pre, in, index + 1, left, i - 1);
        root.right = helper(pre, in, index + i - left + 1, i + 1, right);
        return root;

    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
