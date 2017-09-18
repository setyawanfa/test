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
public class Fish extends Animal{

    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }
    public void swim(){
        System.out.println("Swiming.....");
    }

    
    public void move() {
        System.out.println("Fish is swimming");//To change body of generated methods, choose Tools | Templates.
    }
}
