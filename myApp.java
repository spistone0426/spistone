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
public class myApp {
    
    public static void main(String[] args){
        BSTree<String> myTree = new BSTree<String>();
        myTree.addNode("Chris");
        myTree.addNode("Andrea");
        myTree.addNode("Mary");
        myTree.addNode("Sal");
        myTree.addNode("Billy");
        myTree.addNode("Ronald");
        myTree.addNode("Nick");
        myTree.addNode("Matt");
        myTree.addNode("Adam");
        myTree.addNode("Zack");
        myTree.addNode("Cassidy");
        myTree.addNode("Juliette");
        myTree.addNode("Milo"); 
        myTree.printPreOrder();
        System.out.println();
        myTree.printInOrder();
        System.out.println();
        myTree.printPostOrder();
    }
    
}
 