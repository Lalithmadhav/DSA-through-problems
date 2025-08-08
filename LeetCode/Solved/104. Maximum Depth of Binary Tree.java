import java.util.Deque;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution { // DFS is faster in this case
    // public int maxDepth(TreeNode root) { // DFS
    //     if (root == null) return 0;
    //     int left = maxDepth(root.left);
    //     int right = maxDepth(root.right);
    //     return 1+Math.max(left, right);
    // }

    public int maxDepth(TreeNode root) { // BFS
        if (root == null) return 0;
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root);
        int depth = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i= 0; i<size; i++) {
                TreeNode c = q.poll();
                if(c.left != null) q.add(c.left);
                if(c.left != null) q.add(c.right);
            }
            depth++;
        }
        return depth;
    }
    public void main(String[] args) {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(9);
        TreeNode c = new TreeNode(20);
        TreeNode d = new TreeNode(15);
        TreeNode e = new TreeNode(7);

        a.left = b;
        a.right = c;
        c.left = d;
        c.right = e;

        System.out.println(maxDepth(a));
    }
}