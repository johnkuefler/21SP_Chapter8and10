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
public class ShyCharacter implements GameCharacter {

    private String type;
    
    @Override
    public void setType(String type) {
       this.type = type;
    }

    @Override
    public String getType() {
        return this.type;
    }
    
    public ShyCharacter() {
        this.type = "Shy";
    }

    @Override
    public void interactWithOtherCharacter(GameCharacter otherChar) {
        if (otherChar.getType() == "Shy") {
            System.out.println("You wave at the other character");
        } else {
            System.out.println("You run away");
        }
    }
    
}
