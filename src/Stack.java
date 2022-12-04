import java.util.*;

public class Stack {
    LinkedList ll;
    int maxSize;
    int currentNb;

    public Stack(int size) {
        this.ll = new LinkedList();
        this.currentNb = 0;
        this.maxSize = size;
    }

    public boolean isEmpty() {
        return currentNb == 0;
    }

    public int Size() {
        return currentNb;
    }

    public String Pop() {
        this.currentNb--;
        String temp = ll.first.word;
        ll.deleteFromFront();
        return temp;
    }

    public void reverseStack(Stack stack) {
        Stack newReverseStack = new Stack(stack.Size());
        int nbOfElements = stack.Size();
        for (int i = 0; i < nbOfElements; i++) {
            // We do a pop and a push here on every iteration:
            // Pop:
            newReverseStack.Push(stack.Pop());
        }
        for (int i = 0; i < nbOfElements; i++) {
            // We do a pop and a push here on every iteration:
            // Pop:
            stack.Push(newReverseStack.Pop());
        }
        // return newReverseStack;
    }

    public void Push(String str) {
        this.ll.insertAtFront(str);
        currentNb++;
    }

    public void display() {
        int size = currentNb;
        LinkedList tempStack = new LinkedList();
        for (int i = 0; i < size; i++) {
            tempStack.insertAtFront(this.Pop());
        }
        String temp;
        int nbOfElements = tempStack.length;
        for (int j = 0; j < nbOfElements; j++) {
            // Pop:
            temp = tempStack.first.word;
            tempStack.deleteFromFront();
            // Print:
            System.out.println(temp);
            // Push:
            this.Push(temp);
        }
    }

    public boolean compareStacks(Stack s1, Stack s2) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < s1.Size(); i++) {
                String a = s1.Pop();
                String b = s2.Pop();
                if (!a.equals(b)) {
                    return false;
                }
            }
        }
        return true;
    }
}
