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
public class Zoo {
    public static void main(String[] args){
      Flyable flyingBird = new Sparrow(1,"m",4);
      flyingBird.fly();   
}
