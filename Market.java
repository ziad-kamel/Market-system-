/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.List;

/**
 *
 * @author ziadz
 */
public class Market {
    private String location;
    private List<Product> Products;
    private Head headManager;
    private List<Manager> Managers;
    private List<Employee> Employees;
    private Queue CheeckOutQueue;
    private double sum = 0;

    public void getInQueue(Customer C){
        
//        System.out.println(this.getCheeckOutQueue());
        CheeckOutQueue.EnQueue(C);
    }
    public void CheeckOut(){
        
        while (!CheeckOutQueue.IsEmpty()) {            
            Customer c =CheeckOutQueue.DeQueue();
        double cusum = 0;
        
        for(Product p : c.bought){
//            sum+= p.getProductCost();
            cusum += p.getProductCost();
        }
        
        System.out.println("your total cost is: " + cusum +"\nHappy to serve you " +c.getName() +" :) \n");
        
        }
        
    }
    
    public Market (){
        CheeckOutQueue = new Queue();
//        cahshers = new Multithredthing(5 , this);
    }
    
    @Override
    public String toString(){
        
        return getLocation() + "\n" + getHeadManager().getName() +"\n" + getProducts().size() +"\n" +getManagers().size() +"\n" +getEmployees().size() ;
        
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Product> getProducts() {
        return Products;
    }

    public void setProducts(List<Product> Products) {
        this.Products = Products;
    }

    public Head getHeadManager() {
        return headManager;
    }

    public void setHeadManager(Head headManager) {
        this.headManager = headManager;
    }

    public List<Manager> getManagers() {
        return Managers;
    }

    public void setManagers(List<Manager> Managers) {
        this.Managers = Managers;
    }

    public List<Employee> getEmployees() {
        return Employees;
    }

    public void setEmployees(List<Employee> Employees) {
        this.Employees = Employees;
    }

    public Queue getCheeckOutQueue() {
        return CheeckOutQueue;
    }

    public void setCheeckOutQueue(Queue CheeckOutQueue) {
        this.CheeckOutQueue = CheeckOutQueue;
    }
    
    
}
