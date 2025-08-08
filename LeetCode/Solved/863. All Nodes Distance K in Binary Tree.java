
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    HashMap<TreeNode, TreeNode> hm = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        nodeToParent(root);
        List<Integer> sol = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        queue.offer(target);
        int distance = 0;
        while (!queue.isEmpty() && distance<k) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                for (TreeNode node : getNeighbors(cur)) {
                    if (node != null && !visited.contains(node)) {
                        queue.offer(node);
                        visited.add(node);
                    }
                }
            }
            distance++;
        }
        while (!queue.isEmpty()) {
            sol.add(queue.poll().val);
        }
        return sol;
    }

    public List<TreeNode> getNeighbors(TreeNode root) {
        List<TreeNode> a = new ArrayList<>();
        if (root.left!=null) a.add(root.left);
        if (root.right!=null) a.add(root.right);
        if (hm.containsKey(root)) a.add(hm.get(root));
        return a;
    }

    public void nodeToParent(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) hm.put(root.left, root);
        if (root.right != null) hm.put(root.right, root);
        nodeToParent(root.left);
        nodeToParent(root.right);
    }
    public void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(5);
        TreeNode b = new TreeNode(1);
        TreeNode c = new TreeNode(6);
        TreeNode d = new TreeNode(2);
        TreeNode e = new TreeNode(0);
        TreeNode f = new TreeNode(8);
        TreeNode g = new TreeNode(7);
        TreeNode h = new TreeNode(4);

        root.left = a;
        root.right = b;

        a.left = c;
        a.right = d;

        b.left = e;
        b.right = f;

        d.left = g;
        d.left = h;

        for (Integer i : distanceK(root, a, 2)) {
            System.out.print(i+" ");
        }
    }
}