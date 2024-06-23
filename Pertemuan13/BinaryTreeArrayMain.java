public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray11 bta = new BinaryTreeArray11();
        // int[] data = {6,4,8,3,5,7,9,0,0,0};
        // int idxLast = 6;
        // bta.populateData(data, idxLast);
        // System.out.print("\nInOrder Traversal : ");
        // bta.traverseInOrder(0);
        // System.out.println("\n");

        bta.add(5);
        bta.add(7);
        bta.add(11);
        bta.add(6);
        bta.add(3);

        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.print("Pre-order traversal: ");
        bta.traversePreOrder();
        System.out.println();

        System.out.print("Post-order traversal: ");
        bta.traversePostOrder();
        System.out.println();
    }    
}
    
