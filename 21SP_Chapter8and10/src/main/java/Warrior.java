
import java.util.Random;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Warrior {
    private int hitPoints;
    private int minAttack;
    private int maxAttack;
    private WeaponType weaponType;

    public Warrior(int hitPoints, int minAttack, int maxAttack, WeaponType weaponType) {
        this.hitPoints = hitPoints;
        this.minAttack = minAttack;
        this.maxAttack = maxAttack;
        this.weaponType = weaponType;
    }
    
    public Warrior attack(Warrior warriorToAttack) {
        Random rand = new Random();
        int attackValue =  this.minAttack + (int)(Math.random() * (this.maxAttack - this.minAttack)); 
        
        warriorToAttack.setHitPoints(warriorToAttack.getHitPoints() - attackValue);
        if (warriorToAttack.getHitPoints() < 0) {
            warriorToAttack.setHitPoints(0);
        }
        
        return warriorToAttack;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getMinAttack() {
        return minAttack;
    }

    public void setMinAttack(int minAttack) {
        this.minAttack = minAttack;
    }

    public int getMaxAttack() {
        return maxAttack;
    }

    public void setMaxAttack(int maxAttack) {
        this.maxAttack = maxAttack;
    }

    @Override
    public String toString() {
        return "Warrior{" + "hitPoints=" + hitPoints + ", minAttack=" + minAttack + ", maxAttack=" + maxAttack + '}';
    }
   
    
}
