public class Node {
    Vaksin data;
    Node prev, next;

    Node(Node prev, Vaksin data, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
