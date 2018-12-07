/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_9_binary_tree;

/**
 *
 * @author spist222
 */
public class BSTree<T extends Comparable<T>> {

    BSTNode<T> root;

    public BSTree() {
        this.root = null;
    }

    public void printPreOrder(BSTNode curr) {
        if (curr == null) 
            return;        
        System.out.println(curr.data);
        printPreOrder(curr.leftChild);       
        printPreOrder(curr.rightChild);
    }
    
    public void printPreOrder() {
        printPreOrder(this.root);
    }
    
    public void printPostOrder(BSTNode curr){
        if (curr == null)
            return;
        printPostOrder(curr.leftChild);
        printPostOrder(curr.rightChild);
        System.out.println(curr.data);
    }

    public void printPostOrder(){
        printPostOrder(this.root);
    }
    
    public void printInOrder(BSTNode curr){
        if (curr == null)
            return;
        printInOrder(curr.leftChild);
        System.out.println(curr.data);       
        printInOrder(curr.rightChild);
    }
    public void printInOrder(){
        printInOrder(this.root);
    }

    public void addNode(T newItem) {
        BSTNode<T> newNode = new BSTNode<T>(newItem);

        if (this.root == null) {
            this.root = newNode;
            return;
        }
        BSTNode<T> curr = this.root;
        while (true) {
            if (curr.data.compareTo(newItem) > 0) {
                if (curr.leftChild == null) {
                    curr.leftChild = newNode;
                    return;
                } else {
                    curr = curr.leftChild;
                }
            } else{
                if (curr.rightChild == null){
                    curr.rightChild = newNode;
                    return;
                } else{
                    curr = curr.rightChild;
                }
            }

        }
    }

}
