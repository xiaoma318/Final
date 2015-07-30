package array;

/**
 * Created by chengma on 7/29/15.
 */
public class ConstructTreeFromInorderAndPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, postorder, 0, 0, inorder.length);
    }

    public static TreeNode helper(int[] in, int[] post, int index, int left, int right) {
        if (left > right) return null;
        TreeNode root = new TreeNode(in[index]);
        int i = left;
        for (; i < right; i++) {
            if (in[i] == post[index]) break;
        }
        root.left = helper(in, post, index - 1 - (right - i), left, i - 1);
        root.right = helper(in, post, index - 1, i + 1, right);
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
