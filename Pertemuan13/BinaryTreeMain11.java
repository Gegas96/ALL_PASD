public class BinaryTreeMain11 {
    public static void main(String[] args) {
        BinaryTree11 bt = new BinaryTree11();
        // bt.add(6);
        // bt.add(4);
        // bt.add(8);
        // bt.add(3);
        // bt.add(5);
        // bt.add(7);
        // bt.add(9);
        // bt.add(10);
        // bt.add(15);
        bt.addRek(6);
        bt.addRek(4);
        bt.addRek(8);
        bt.addRek(3);
        bt.addRek(5);
        bt.addRek(7);
        bt.addRek(9);
        bt.addRek(10);
        bt.addRek(15);


        System.out.print("Leaf : ");
        bt.leafData();
        System.out.println(""); 

        System.out.print("Jumlah Leaf : " +bt.countLeaf());
        System.out.println(""); 

        System.out.print("Min : "+ bt.findMin());
        System.out.println(""); 

        System.out.print("Max : " + bt.findMax());
        System.out.println(""); 

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find Node : " + bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");
        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
    }
}
