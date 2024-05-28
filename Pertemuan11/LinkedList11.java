

public class LinkedList11 {
    Node11 head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi Linked List: ");
            Node11 currentNode11 = head;

            while (currentNode11 != null) {
                System.out.print(currentNode11.data + "\t");
                currentNode11 = currentNode11.next;
            }

            System.out.println("");
        } else {
            System.out.println("Linked List kosong!");
        }
    }

    public void addFirst(int input) {
        Node11 newNode11 = new Node11(input, null, null);

        if (isEmpty()) {
            head = newNode11;
        } else {
            newNode11.next = head;
            head = newNode11;
        }
    }

    public void addLast(int input) {
        Node11 newNode11 = new Node11(input, null, null);

        if (isEmpty()) {
            head = newNode11;
        } else {
            Node11 currentNode11 = head;

            while (currentNode11.next != null) {
                currentNode11 = currentNode11.next;
            }

            currentNode11.next = newNode11;

        }
    }

    public void insertAfter(int key, int input) {
        Node11 newNode11 = new Node11(input, null, null);

        if (!isEmpty()) {
            Node11 currentNode11 = head;

            do {
                if (currentNode11.data == key) {
                    newNode11.next = currentNode11.next;
                    currentNode11.next = newNode11;
                    break;
                }

                currentNode11 = currentNode11.next;
            } while (currentNode11 != null);
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    public int getData(int index) {
        Node11 currentNode11 = head;

        for (int i = 0; i < index; i++) {
            currentNode11 = currentNode11.next;
        }

        return currentNode11.data;

    }


    public int indexOf(int key) {
        Node11 currentNode11 = head;
        int index = 0;

        while (currentNode11 != null && currentNode11.data != key) {
            currentNode11 = currentNode11.next;
            index++;
        }

        if (currentNode11 == null) {
            return -1;
        } else {
            return index;
        }
    }

    public boolean cekIndex(int index) {
        Node11 currentNode11 = head;
        for (int i = 0; i < index; i++) {
            if (currentNode11 == null) {
                System.out.println("Data tidak ditemukan");
                return false;
            }
            currentNode11 = currentNode11.next;
        }
        return true;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong!");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
        } else if (head.next == null) {
            head = null;
        } else {
            Node11 curretNode11 = head;

            while (curretNode11.next != null) {
                if (curretNode11.next.next == null) {
                    curretNode11.next = null;
                    break;
                }

                curretNode11 = curretNode11.next;

            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node11 currentNode11 = head;

            while (currentNode11.next != null) {
                if (currentNode11.next.data == key) {
                    currentNode11.next = currentNode11.next.next;
                    break;
                }

                currentNode11 = currentNode11.next;

            }
        }
    }

    public void insertBefore(int key, int input) {
        Node11 newNode11 = new Node11(input, null, null);

        if (!isEmpty()) {
            Node11 currentNode11 = head;

            do {    
                if (currentNode11.data == key) {
                    newNode11.next = currentNode11;
                    newNode11.prev = currentNode11.prev;
                    break;
                }

                if (currentNode11.prev != null) {
                    currentNode11.prev.next = newNode11;
                }

                currentNode11 = currentNode11.prev;
            } while (currentNode11 != null);
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    public void insertAt(int index, int key) {
        Node11 node = new Node11(key, null, null);
        if (index == 0) {
            addFirst(key);
            return;
        }

        Node11 currentNode11 = head;
        int counter = 0;
        while (currentNode11 != null && counter < index - 1) {
            currentNode11 = currentNode11.next;
            counter++;
        }

        if (currentNode11.next == null) {
            addLast(key);
            return;
        }

        node.next = currentNode11.next;
        currentNode11.next = node;

    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node11 currentNode11 = head;
            int currentIndex = 0;
            while (currentNode11 != null && currentIndex < index - 1) {
                currentNode11 = currentNode11.next;
                currentIndex++;
            }
            currentNode11.next = currentNode11.next.next;
        }
    }
}
