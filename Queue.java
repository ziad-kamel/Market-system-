/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author ziadz
 */
class Queue {
    private Customer Queue[];
    private int Size;
    private int NoOfElement;
    private int Front,Rear;
    
    public Queue(){
        Size = 10;
        Queue = new Customer [Size];
        NoOfElement = 0 ; 
        Rear = Front = 0;
    }
    public Queue(int S){
        Size = S;
        Queue = new Customer [Size];
        NoOfElement = 0 ; 
        Rear = Front = 0;
    }
    
    public boolean IsEmpty(){
        return Front==Rear;
    }
    
    public boolean EnQueue(Customer c){
        boolean retval =false;
        if(NoOfElement < Size){
            Queue[Rear] = c;
            NoOfElement ++;
            Rear = (Rear+1)%Size;
            retval = true;
        }
        return retval;
        
    }
    
    public Customer DeQueue(){
        Customer retval = null;
        
        if(NoOfElement > 0){
            retval = Queue[Front];
            NoOfElement--;
            Front = (Front +1)%Size;
        }
        
        return retval;
    }
    
}
