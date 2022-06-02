/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ziadz
 */
class Customer {
    private String Name;
    private String add;
    private String Email;
    private String shippinfo;
    private String CreadetInfo;
    public Market Market;
    List<Product> bought;

    public Customer(String Name, String add, String Email, String shippinfo, String CreadetInfo , Market Market) {
        this.Name = Name;
        this.add = add;
        this.Email = Email;
        this.shippinfo = shippinfo;
        this.CreadetInfo = CreadetInfo;
        this.Market = Market;
        
        bought = new ArrayList();
    }
    
    public void buy(Product p){
//        System.out.println(Market.getProducts());
        Market.getProducts().remove(p);
        bought.add(p);
//        System.out.println(this.Name +" buy: " +p.getProductName() +" ID: "+ p.getProductID() +" Price: "+p.getProductCost());
        
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getShippinfo() {
        return shippinfo;
    }

    public void setShippinfo(String shippinfo) {
        this.shippinfo = shippinfo;
    }

    public String getCreadetInfo() {
        return CreadetInfo;
    }

    public void setCreadetInfo(String CreadetInfo) {
        this.CreadetInfo = CreadetInfo;
    }
    
    
}
