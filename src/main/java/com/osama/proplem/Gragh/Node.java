package com.osama.proplem.Gragh;

public class Node <T> {

    private int value;
    private Node rightNode;
    private Node leftNode;

    public Node(int value){
        this.value=value;
        this.leftNode=null;
        this.rightNode=null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }
}
