package initial.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test4 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<TreeNode> preNode = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }

        preNode.add(root);
        List<Integer> rootline = new ArrayList<>();
        rootline.add(root.val);
        res.add(rootline);
        while (preNode.size() > 0){
            List<Integer> line = new ArrayList<>();
            List<TreeNode> pre = new LinkedList<>();
            while (preNode.size() > 0){
                TreeNode node = ((LinkedList<TreeNode>) preNode).pop();
                if (node.left != null){
                    line.add(node.left.val);
                    pre.add(node.left);
                }
                if (node.right != null){
                    line.add(node.right.val);
                    pre.add(node.right);
                }
            }
            preNode = pre;
            if (line.size() > 0){
                res.add(line);
            }
        }
        return res;
    }

    // DFS

}
