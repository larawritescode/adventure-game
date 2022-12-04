public class LinkedList {
    public Node first;
    int length;

    public void insert(String data, int id) {
        Node p = new Node(data, id);
        if (first == null) {
            first = p;
        } else {
            Node current = first;
            while (current.next != null) {
                if (current.next.key < id)
                    current = current.next;
            }
            p.prev = current;
            current.next = p;
        }
    }

    public void insert(String data) {
        Node p = new Node(data);
        if (first == null) {
            first = p;
        } else {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
            p.prev = current;
            current.next = p;
        }
    }

    public void insertAtFront(String data) {
        if (first == null) {
            this.first = new Node(data);
            length++;
            return;
        }
        Node node = new Node(data);
        node.next = this.first;
        this.first = node;
        length++;
    }

    public int search(String data) {
        if (first == null)
            return -1;
        else {
            Node current = first;
            while (current != null) {
                if (current.word.equals(data))
                    break;
                else
                    current = current.next;
            }
            if (current == null) {
                return -1;
            } else {
                return current.key;
            }

        }
    }

    public Node delete(String word) {
        Node p = new Node(word);
        Node current = first;
        if (current.word.equals(word)) {
            if (first.next == null) {
                first = null;
            } else {
                current.next.prev = null;
                first = current.next;
            }
            current = null;
        } else {
            while (current != null) {
                if (current.word.equals(word)) {
                    if (current.next == null) {
                        current.prev.next = null;
                    } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                    }
                    current = null;
                } else {
                    current = current.next;
                }
            }
        }
        return p;
    }

    public void deleteFromFront() {
        if (first == null) {
            System.out.println("LinkedList is empty!");
            return;
        }
        this.first = this.first.next;
        length--;
    }

    public void display() {
        Node current = first;
        while (current != null) {
            System.out.println(current.word);
            current = current.next;
        }
    }

}
