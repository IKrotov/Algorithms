package tree;

public class Tree {

    private Node root;

    public Node search(int key){

        Node current = root;

        while (current.getKey() != key){

            if (key > current.getKey()){
                current = current.getRightChild();
            } else {
                current = current.getLeftChild();
            }
        }

        return current;
    }

    public void insert(int key, String val){
        Node node = new Node(key, val);

        if (root == null){
            root = node;
        } else {

            Node current = root;

            while (true){
                if (key < current.getKey()){

                    if (current.getLeftChild() != null) {
                        current = current.getLeftChild();
                    } else {
                        current.setLeftChild(node);
                        return;
                    }
                } else {
                    if (current.getRightChild() != null){
                        current = current.getRightChild();
                    } else {
                        current.setRightChild(node);
                        return;
                    }
                }
            }

        }
    }

    public void printTree(Node node){

        if (node != null) {

            printTree(node.getLeftChild());

            node.printNode();

            printTree(node.getRightChild());

        }

    }

    public void printTree(){

        printTree(root);
    }

}
