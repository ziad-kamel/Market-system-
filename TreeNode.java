/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ziadz
 */
public class TreeNode {
    Employee data;
    TreeNode Right;
    TreeNode Left;

    public TreeNode(Employee data) {
        this.data = data;
        Left = Right = null;
    }
    
    
}
