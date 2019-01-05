public TreeNode findDeepest(TreeNode root) { 
    if(root == null)return null;
    Queue<TreeNode> queue = new LinkedList();
    queue.add(root);
    TreeNode cur = null;
    while(!queue.isEmpty()){
        cur = queue.remove();
        if(cur.left!= null)queue.add(cur.left);
        if(cur.right!= null)queue.add(cur.right);
    }
    return cur;
}
