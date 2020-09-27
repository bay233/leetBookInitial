package initial.tree;

public class Test1 {

    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = 1;
        int right = 1;
        if (root.left != null) {
            left += maxDepth(root.left) ;
        }
        if (root.right != null) {
            right += maxDepth(root.right);
        }

        return left > right ? left : right;
    }

    public static void main(String[] args) {

    }
}
