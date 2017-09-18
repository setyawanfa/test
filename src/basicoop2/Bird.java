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
public class Bird extends Animal{

    public Bird(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    
    public void move() {
        System.out.println("flapping wings...");//body of generated methods, choose Tools | Templates.
    }

    
    
}
