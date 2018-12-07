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
public class BSTNode <T extends Comparable<T>> {
    public T data;
    
    public BSTNode<T> leftChild;
    public BSTNode<T> rightChild;
    
    public BSTNode(T data){
        this.data = data;
    }
    public String toString(){
        return this.data.toString();
    }

    //Constructor
    public BSTNode(T data, BSTNode<T> leftChild, BSTNode<T> rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }
    
    
}
