public class Tree {
    public TNode root;

    public void insert(int k) {
        TNode p = new TNode(k);
        if (root == null) {
            this.root = p;
            return;
        }
        TNode current = root;
        TNode parent;
        while (true) {
            parent = current;
            if (k < current.key) {
                current = current.left;
                if (current == null) {
                    parent.left = p;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = p;
                    return;
                }
            }
        }
    }

}
