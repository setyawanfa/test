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
        
        /*Animal animal1 = new Animal(12,"M",23);
        animal1.eat();
        
        Bird bird1 = new Bird(3,"M",20);
        bird1.sleep();
        
        Fish fish1 = new Fish(2,"F",3);
        fish1.eat();
        Animal sparrow1 = new Sparrow(1,"M",4);
        //sparrow1.move();
        Animal fish = new Fish(1,"M",2);
        //fish.move();
        moveAnimal(sparrow1);
        moveAnimal(fish);
    }
    public static void moveAnimal(Animal animal){
        animal.move();
    }*/
}
