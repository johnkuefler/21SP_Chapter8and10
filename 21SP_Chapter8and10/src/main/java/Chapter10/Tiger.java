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
public class Tiger extends Animal {
    private int numberOfStripes;

    public Tiger(int numberOfStripes, String speciesName, String color) {
        super(speciesName, color);
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public String toString() {
        return "Tiger{" + "numberOfStripes=" + numberOfStripes + '}' + super.toString();
    }
    
    
    @Override
    public void makeASound() {
        System.out.println("The tiger roared");
    }
}
