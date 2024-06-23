public class BinaryTreeArray11 {
    int[] data;
    int idxlast;
    int maxSize;

    public BinaryTreeArray11() {
        maxSize = 10;
        data = new int[10];
        idxlast = -1;
    }

    void populateData(int data[], int idxlast) {
        this.data = data;
        this.idxlast = idxlast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void add(int data) {
        if (idxlast < maxSize - 1) {
            idxlast++;
            this.data[idxlast] = data;
        } else {
            System.out.println("Tree is full!");
        }
    }

    void traversePreOrder() {
        traversePreOrder(0);
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxlast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder() {
        traversePostOrder(0);
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxlast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}