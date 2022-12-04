public class createAndTraverse {
    public static Tree createTree() {
        Tree tree = new Tree();
        TNode root = new TNode(120);
        tree.insert(120); // insert root
        // insert left sub-tree C
        tree.insert(80);
        tree.insert(100);
        tree.insert(110);
        tree.insert(108);
        tree.insert(109);
        tree.insert(106);
        tree.insert(112);
        tree.insert(111);
        tree.insert(114);

        // inser left sub-tree B
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
        tree.insert(64);
        tree.insert(65);
        tree.insert(62);
        tree.insert(72);
        tree.insert(71);
        tree.insert(74);

        // insert left sub-tree A
        tree.insert(20);
        tree.insert(18);
        tree.insert(14);
        tree.insert(12);
        tree.insert(10);
        tree.insert(4);
        tree.insert(2);
        tree.insert(3);
        tree.insert(0);
        tree.insert(6);
        tree.insert(5);
        tree.insert(8);

        // insert right sub-tree D
        tree.insert(150);
        tree.insert(130);
        tree.insert(138);
        tree.insert(136);
        tree.insert(137);
        tree.insert(140);
        tree.insert(139);
        tree.insert(142);
        tree.insert(134);

        // insert right sub-tree E
        tree.insert(180);
        tree.insert(160);
        tree.insert(162);
        tree.insert(170);
        tree.insert(172);
        tree.insert(168);
        tree.insert(166);
        tree.insert(172);
        tree.insert(174);
        tree.insert(169);
        tree.insert(171);

        // insert right sub-tree F
        tree.insert(190);
        tree.insert(200);
        tree.insert(210);
        tree.insert(220);
        tree.insert(230);
        tree.insert(228);
        tree.insert(226);
        tree.insert(240);
        tree.insert(250);
        tree.insert(229);
        tree.insert(239);
        return tree;
    }

    public static void begin() {
        Tree tree = createTree();
        TNode current = tree.root;
        String result1 = adventure.triggerGame(current);
        while (!result1.equals("exit")) {
            if (result1.equals("left")) {
                current = current.left;
            } else {
                current = current.right;
            }
            result1 = adventure.triggerGame(current);

        }

    }
}
