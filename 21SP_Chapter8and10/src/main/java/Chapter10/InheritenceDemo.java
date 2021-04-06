/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author johnk
 */
public class InheritenceDemo {

    public static void main(String[] args) {

        Tiger myTiger = new Tiger(5, "Tiger", "Color");
        // myTiger.makeASound();

        Elephant myElephant = new Elephant(7.5);
        // myElephant.makeASound();

        doAnimalStuff(myTiger);
        doAnimalStuff(myElephant);

        GameCharacter char1 = new ShyCharacter();
        GameCharacter char2 = new OutgoingCharacter();
        
        interactCharacters(char1,char2);
    }

    public static void interactCharacters(GameCharacter char1, GameCharacter char2) {
        char1.interactWithOtherCharacter(char2);
        char2.interactWithOtherCharacter(char1);
    }

    public static void doAnimalStuff(Animal animal) {
        animal.makeASound();
        System.out.println(animal.toString());
    }

}
