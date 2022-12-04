public class Node {
    public Node next, prev;
    public int key;
    public String word;

    public Node(String w, int id) {
        this(w, id, null, null);
    }

    public Node(String w) {
        this(w, 0, null, null);
    }

    public Node(String w, int id, Node n, Node p) {
        this.word = w;
        this.key = id;
        this.next = n;
        this.prev = p;
    }
}
