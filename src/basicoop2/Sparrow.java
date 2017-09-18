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
public class Sparrow extends Bird implements Flyable{
    
    public Sparrow(int age, String gender, int weight) {
        super(age, gender, weight);
    }
    
    @Override
    public void fly(){
        System.out.println("Flying...");
    
}
}