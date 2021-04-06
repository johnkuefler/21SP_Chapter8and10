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
public interface GameCharacter {
    
    public abstract void setType(String type);
    public abstract String getType();
    
    public abstract void interactWithOtherCharacter(GameCharacter otherChar);
    
}
