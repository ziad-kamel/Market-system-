/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ziadz
 */
class Manager extends Employee implements Managers{
     

    public Manager(String Name, String poss, String ID, double Salary, Market workingMarket) {
        super(Name, poss, ID, Salary, workingMarket);
        
    }
    
    public void Hire (Employee e){
        this.getWorkingMarket().getEmployees().add(e);
    }
    
    public void Fire (Employee e){
        this.getWorkingMarket().getEmployees().remove(e);
    }
    
}
