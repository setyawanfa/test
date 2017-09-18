/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoop2;

/**
 *
 * @author F. Andy
 */
public abstract class Animal {

    /**
     * @param args the command line arguments
     */
    int age;
    String gender;
    int weight;
    
    public Animal(int age, String gender, int weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        
    }
    
    public void eat(){
        System.out.println("Eating....");
        

    }
    
    public void sleep(){
        System.out.println("Sleeping....");
        
    }
    public abstract void move();
}
