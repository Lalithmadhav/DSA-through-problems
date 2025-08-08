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

class Solution {
    public boolean isSymmetric(TreeNode root) { // DFS is faster
        // DFS
    //     if (root==null) return true;
    //     return isMirror(root.left, root.right);
    // }
    // boolean isMirror(TreeNode left, TreeNode right) {
    //     if (left==null&&right==null) return true;
    //     if (left==null||right==null) return false;
    //     return left.val==right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left);
        // BFS
        if (root==null) return true;
        Deque<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode l = q.poll();
                TreeNode r = q.poll();

                if (l==null&&r==null) continue;
                if (l==null || r==null|| l.val!=r.val) return false;

                q.add(l.left);
                q.add(r.right);
                q.add(r.left);
                q.add(l.right);
            }
        }
        return true;
    }
    public void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(2);
        TreeNode d = new TreeNode(3);
        TreeNode e = new TreeNode(4);
        TreeNode f = new TreeNode(4);
        TreeNode g = new TreeNode(3);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.println(isSymmetric(a));
    }
}