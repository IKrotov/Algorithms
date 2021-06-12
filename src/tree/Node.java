package tree;

public class Node {

    private String val;
    private int key;
    private Node leftChild;
    private Node rightChild;

    public Node(int key, String val) {
        this.val = val;
        this.key = key;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void printNode(){

        System.out.println("key :" + key + " val: " + val);
    }
}
