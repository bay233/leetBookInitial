package initial.tree;

public class Test2 {


    // 中序遍历解法
    public static long value = Long.MIN_VALUE;
    public static boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (!isValidBST(root.left)){
            return false;
        }
        if (root.val <= value){
            return false;
        }
        value = root.val;

        if (!isValidBST(root.right)){
            return false;
        }

        return true;
    }


    // 上下界解法
    public boolean recurse(TreeNode root, Integer lower, Integer upper){
        if (root == null){
            return true;
        }

        int val = root.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (!recurse(root.left, lower, val)) return false;
        if (!recurse(root.right, val, upper)) return false;

        return true;

    }

    public static void main(String[] args) {
        /*TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        TreeNode right = root.right;
        right.left = new TreeNode(6);
        right.right = new TreeNode(20);*/

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(5);
        TreeNode left = root.left;
        left.left = new TreeNode(0);
        left.right = new TreeNode(2);
        TreeNode right = root.right;
        right.left = new TreeNode(4);
        right.right = new TreeNode(6);
        TreeNode right1 = left.right;
        right1.right = new TreeNode(3);


        System.out.println(isValidBST(root));
    }
}
