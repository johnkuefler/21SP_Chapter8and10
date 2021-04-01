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
public class Elephant extends Animal {
    private double trunkLength;

    public Elephant(double trunkLength) {
        super("Elephant", "Gray");
        this.trunkLength = trunkLength;
    }
    
    public double getTrunkLength() {
        return trunkLength;
    }

    public void setTrunkLength(double trunkLength) {
        this.trunkLength = trunkLength;
    }
}
