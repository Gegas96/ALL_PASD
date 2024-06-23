public class LinkedList11 {
    
    Node11 head;

    public LinkedList11() {
        head = null;
    }

    public void add(InGadgetColle11 data) {
        Node11 newNode = new Node11(data);
        if (head == null) {
            head = newNode;
        } else {
            Node11 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public InGadgetColle11 get(String id) {
        Node11 current = head;
        while (current != null) {
            if (current.data.id.equals(id)) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    public void printAll() {
        Node11 current = head;
        System.out.println("---------------------------------------------------");
        System.out.printf("| %-7s| %-20s | %-15s |", "Id", "Nama Gadget", "Harga");
        System.out.println("\n---------------------------------------------------");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void delete(String id) {
        if (head == null) {
            return;
        }

        if (head.data.id.equals(id)) {
            head = head.next;
            return;
        }

        Node11 current = head;
        while (current.next != null && !current.next.data.id.equals(id)) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    public void sortAsc() {
        if (head == null || head.next == null) {
            return;
        }
    
        Node11 current = head;
        while (current != null) {
            Node11 minNode = current;
            Node11 next = current.next;
    
            while (next != null) {
                if (next.data.harga < minNode.data.harga) {
                    minNode = next;
                }
                next = next.next;
            }
    
            if (minNode != current) {
                double tempHarga = current.data.harga;
                String tempId = current.data.id;
                String tempNamaGadget = current.data.item;
    
                current.data.harga = minNode.data.harga;
                current.data.id = minNode.data.id;
                current.data.item = minNode.data.item;
    
                minNode.data.harga = tempHarga;
                minNode.data.id = tempId;
                minNode.data.item = tempNamaGadget;
            }
    
            current = current.next;
        }
        printAll();
    }
    
}
