public class TNode {
    public TNode left, right;
    public int key;

    public TNode(int id) {
        this(id, null, null);
    }

    public TNode(int id, TNode l, TNode r) {
        this.key = id; // KEY VALUE IS PASSED TO KNOW WHAT GAME IS GONNA TRIGGER
        this.left = l;
        this.right = r;
    }
}
