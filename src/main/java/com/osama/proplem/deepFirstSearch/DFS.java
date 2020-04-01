package com.osama.proplem.deepFirstSearch;

public class DFS {
    public static void main(String[] args) {
        DeepFirstSearch deepFirstSearch=new DeepFirstSearch(15);
        deepFirstSearch.addNode(1,4);
        deepFirstSearch.addNode(1,3);

        deepFirstSearch.addNode(3,6);

        deepFirstSearch.addNode(3,5);
        deepFirstSearch.addNode(1,4);
        deepFirstSearch.addNode(4,7);
        deepFirstSearch.addNode(4,2);

        deepFirstSearch.DFSExp(1);

    }
}
