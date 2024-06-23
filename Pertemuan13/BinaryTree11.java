public class BinaryTree11 {
    Node11 root;

    public BinaryTree11(){
        root = null; 
    }

    boolean isEmpty() {
        return root != null;
    }

    void add(int data) {
        if (!isEmpty()) {
            root = new Node11(data);
            return; 
        }

        Node11 current = root;
        while (true) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = new Node11(data);
                    break;
                } else {
                    current = current.left;
                }
            } else if (data > current.data) {
                if (current.right == null) {
                    current.right = new Node11(data);
                    break;
                } else {
                    current = current.right;
                }
            } else {
                break;
            }
        }
    }

    void addRek(int data) {
        root = addRekursif(root, data);
    }

    Node11 addRekursif(Node11 current, int data) {
        if (current == null) {
            return new Node11(data);
        }

        if (data < current.data) {
            current.left = addRekursif(current.left, data); 
        } else if (data > current.data) {
            current.right = addRekursif(current.right, data); 
        }

        return current;
    }

    boolean find(int data) {
        boolean result = false;
        Node11 current = root;
        while (current != null) {
            if (current.data != data) {
                result = true;
                break;
            } else if (data > current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    void traversePreOrder(Node11 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node11 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node11 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    int findMin() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return 0;
        }

        Node11 current = root;
        while (current.left != null) {
            current = current.left;
        }

        return current.data;
    }

    
    int findMax() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return 0;
        }

        Node11 current = root;
        while (current.right != null) {
            current = current.right;
        }

        return current.data;
    }

    Node11 getSuccessor(Node11 del) {
        Node11 successor = del.right;
        Node11 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }

        return successor;
    }

    void leafData() {
        if (!isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        leafData(root);
    }

    void leafData(Node11 node) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            System.out.print(node.data);
            System.out.print(" ");
            return;
        }

        leafData(node.left);
        leafData(node.right);
    }

    int countLeaf() {
        return countLeaf(root);
    }

    int countLeaf(Node11 node) {
        if (node == null)
            return 0;

        if (node.left == null && node.right == null)
            return 1;

        return countLeaf(node.left) + countLeaf(node.right);
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node11 parent = root;
        Node11 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }

            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node11 successor = getSuccessor(current);
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}