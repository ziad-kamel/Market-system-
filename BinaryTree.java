/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ziadz
 */
public class BinaryTree {
    private TreeNode Root ;

    public BinaryTree() {
        Root = null;
    }
    
    public boolean IsEmpty(){
        return (Root==null);
    }
    
    private TreeNode InserNode (TreeNode node, Employee data){
        if(node == null){
            node = new TreeNode(data);
        }
        else if(node.Right == null){
            node.Right = InserNode(node.Right, data);
        }
        else{
            node.Left = InserNode(node.Left, data);
        }
        return node;
    }
    
    

    private int countNodes(TreeNode node) {
        int retval;
        if(node == null){
            retval = 0 ;
        }
        else{
            int x = 1;
            x+=countNodes(node.Right);
            x+=countNodes(node.Left);
            retval = x;
        }
        return retval;
    }
    
    
    public void Insert (Employee data){
        Root = InserNode(Root, data);
    }
    
    public int count (){
        return countNodes(Root);
    }
    
    
    //in this method the process is to display each node in the tree
    //1st if root is empty then creat the node 
    //2nd in this cass if root.Left != null then coun
    private String display(TreeNode root){//post travers
        String retval ="";
        
        if(root == null){
            System.out.println("<Empty>");
        }
        else if (root.Left != null){// travers left
            retval+= display(root.Left) + display(root.Right);
        }
        else if(root.Right !=null){//travers right
            retval += display(root.Right);
        }
        //process root
            retval += root.data.getName() + " " +root.data.getPoss()+"\n";
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Staff.txt"));
            writer.write(retval +"\n");
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(BinaryTree.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retval;
    }
    //this is thee recuriv method that calls display()
    public String Display(){
        return display(Root);
    }
    
}
