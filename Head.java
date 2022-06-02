/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ziadz
 */
class Head extends Manager implements Managers{

    public Head(String Name, String poss, String ID, double Salary, Market workingMarket) {
        super(Name, poss, ID, Salary, workingMarket);
    }
    
    
    public void Hire (Manager m){
        this.getWorkingMarket().getManagers().add(m);
    }
    
    public void Fire (Manager m){
        this.getWorkingMarket().getManagers().remove(m);
    }
    
    
    
}
