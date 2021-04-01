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
        myTiger.makeASound();

        Elephant myElephant = new Elephant(7.5);
        myElephant.makeASound();

    }
}
