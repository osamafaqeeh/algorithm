package com.osama.proplem.deepFirstSearch;

import java.util.Stack;

public class DeepFirstSearch {
    private NodeDFS[]array;
    private int size;
    public DeepFirstSearch(int size){
        this.size=size;
        this.array=new NodeDFS[size];
    }
    public void addNode(int src,int value){
        if (array[src]==null){
        array[src]=new NodeDFS(value,null);}
        else {
            NodeDFS node=new NodeDFS(value,array[src]);
            array[src]=node;
        }
    }
    public void DFSExp(int startVertax){
        Stack<Integer>stack=new Stack<Integer>();
        boolean[]visited=new boolean[size];
        for (int i=0;i<visited.length;i++){
            visited[i]=false;
        }
        stack.push(startVertax);
        while (!stack.isEmpty()){
            int n=stack.peek();
            NodeDFS pointer=array[n];
            boolean isDone=true;
            while (pointer!=null){
                if (!visited[pointer.value]){
                    stack.push(pointer.value);
                    visited[pointer.value]=true;
                    isDone=false;
                    System.out.println("viseted"+pointer.value);
                    break;
                }
                else{
                    pointer=pointer.next;
                }
            }
            if (isDone){
                stack.pop();
            }


        }


    }
}
