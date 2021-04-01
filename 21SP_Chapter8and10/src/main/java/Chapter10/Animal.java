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
public class Animal {
    private String speciesName;
    private String color;

    public Animal(String speciesName, String color) {
        this.speciesName = speciesName;
        this.color = color;
    }
    
    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    // can prevent this from being overriden with final keyword
    public  void makeASound() {
        System.out.println("The animal made a sound");
    }

    @Override
    public String toString() {
        return "Animal{" + "speciesName=" + speciesName + ", color=" + color + '}';
    }
    
    
    
    
}
