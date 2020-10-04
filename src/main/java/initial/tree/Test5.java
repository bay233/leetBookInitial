package initial.tree;

public class Test5 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        int start = 0;
        int end = nums.length - 1;
        return dfs(nums, start, end);
    }

    public TreeNode dfs(int[] nums, int start, int end){
        if (start == end){
            return new TreeNode(nums[start]);
        }
        if (start > end){
            return null;
        }

        int mind = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mind]);
        node.left = dfs(nums, start, mind - 1);
        node.right = dfs(nums, mind + 1, end);
        return node;
    }
}
