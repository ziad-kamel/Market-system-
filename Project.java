/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ziadz
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Market m = new Market();
        
        Head headmanager = new Head("maged", "Head", "1", 300000, m);
        m.setHeadManager(headmanager);
        
        
        List<Manager> managers =new ArrayList<>();
        Manager manager1 = new Manager("ahmed", "manager1", "0", 1000, m);
        Manager manager2 = new Manager("ali", "manager2", "00", 1000, m);
        Manager manager3 = new Manager("mohamed", "manager3", "000", 1000, m);
        managers.add(manager1);
        managers.add(manager2);
        managers.add(manager3);
        m.setManagers(managers);
        
        List<Employee> employees =new ArrayList<>();
        Employee casher1 = new Employee("ziad", "casher1", "4", 500, m);
        Employee casher2 = new Employee("omar", "casher2", "5", 500, m);
        Employee casher3 = new Employee("khaled", "casher3", "6", 500, m);
        Employee casher4 = new Employee("youssef", "casher4", "6", 500, m);
        employees.add(casher1);
        employees.add(casher2);
        employees.add(casher3);
        employees.add(casher4);
        m.setEmployees(employees);
        
        List<Product> Products =new ArrayList<>();
        Product egg = new Product("egg", "1", 5.0);
        Product milk = new Product("milk", "2", 10.3);
        Product tee = new Product("tee", "3", 3.1);
        Products.add(tee);
        Products.add(milk);
        Products.add(egg);
        m.setProducts(Products);
        
        
        Customer c1 = new Customer("david", "15-ezxrf", "khamiskaka@haha.com", "kasnknd", "52235" , m);
        Customer c2 = new Customer("bob", "15-ezxrf", "khamiskaka@haha.com", "kasnknd", "52235" , m);
        Customer c3 = new Customer("jon", "15-ezxrf", "khamiskaka@haha.com", "kasnknd", "52235" , m);
        
        
//        System.out.println(m.getProducts().size());
        c1.buy(tee);
        c1.buy(milk);
        
        c2.buy(milk);
        c3.buy(egg);
//        System.out.println(m.getProducts().size());
        
        
        m.getInQueue(c1);
        m.getInQueue(c2);
        m.getInQueue(c3);
        
        m.CheeckOut();
                
        
        
        BinaryTree bt = new BinaryTree();
        
        bt.Insert(headmanager);
        bt.Insert(manager1);
        bt.Insert(manager2);
        bt.Insert(manager3);
        bt.Insert(casher1);
        bt.Insert(casher2);
        bt.Insert(casher3);
        bt.Insert(casher4);
        
        System.out.println(bt.Display());
        
    }
    
}
