package com.osama.proplem.BinaryTreePtoblem;

public class BinaryTree {

    private Node head;

    public BinaryTree(Node head) {
        this.head = head;
    }

    public void addValue(Node newNode,Node node){
        if (newNode.getValue()>node.getValue()){
            if (node.getRightNode()!=null){
                addValue(newNode,node.getRightNode());
            }
            else {
                node.setRightNode(newNode);
            }
        }
        if (newNode.getValue()<node.getValue()){
            if (node.getLeftNode()!=null){
                addValue(newNode,node.getRightNode());
            }
            else {
                node.setLeftNode(newNode);
            }
        }
    }
    public Node search(int value,Node head){
        if (value==head.getValue()){
            return head;
        }
        else {
            if (value>head.getValue()&&head.getRightNode()!=null){
                search(value,head.getRightNode());
            }
           else if (value<head.getValue()&&head.getLeftNode()!=null){
                search(value,head.getLeftNode());
            }
           else {
               throw new RuntimeException("not found");
            }
        }
        return null;

    }
}
