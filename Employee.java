/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ziadz
 */
class Employee {
    private String Name;
    private String poss;
    private String ID;
    private double Salary;
    private Market workingMarket;
    
    
    public void add(Product p){
        workingMarket.getProducts().add(p);
    }
    
     public void remove(Product p){
        workingMarket.getProducts().remove(p);
    }
   
    
    

    public Employee(String Name, String poss, String ID , double Salary , Market workingMarket) {
        this.Name = Name;
        this.poss = poss;
        this.ID = ID;
        this.Salary = Salary;
        this.workingMarket = workingMarket;
        
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPoss() {
        return poss;
    }

    public void setPoss(String poss) {
        this.poss = poss;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
     public Market getWorkingMarket() {
        return workingMarket;
    }

    public void setWorkingMarket(Market workingMarket) {
        this.workingMarket = workingMarket;
    }
    
}
