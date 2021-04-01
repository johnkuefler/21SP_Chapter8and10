
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {

        // instance method usage with classes
        Rectangle rect1 = new Rectangle(10, 20);
        rect1.getWidth();

        Rectangle rect2 = new Rectangle(50, 50);
        displayRectangle(rect2);
        
        // don't do this!
        // if (rect1 == rect2) -- compares memory addresses
        if (rect1.equals(rect2)) {
            //yay they're equal!
        }
        
        // don't do this
        //Rectangle rect3 = rect2;

        // do this instead
        Rectangle rect3 = new Rectangle(rect2);
        
        
        Rectangle biggerRect = GetBiggerRectangle(rect1, rect2);
        displayRectangle(biggerRect);

        // static method usage
        boolean isValidEmail = FormatValidator.IsValidEmail("test@test.com");
        boolean isValidPhone = FormatValidator.IsValidPhoneNumber("1111");

        
        // interaction between objects
        Warrior archer = new Warrior(20, 0, 10, WeaponType.BOW);
        Warrior swordsman = new Warrior(30, 1, 5, WeaponType.SWORD);
        
        Scanner keyboard = new Scanner(System.in);
        
        while (archer.getHitPoints() > 0 || swordsman.getHitPoints() > 0) {
        
            swordsman = archer.attack(swordsman);
            archer = swordsman.attack(archer);
            
            System.out.println("Swordsman: " + swordsman.toString());
            System.out.println("Archer: " + archer.toString());
            
            String temp = keyboard.nextLine();
        }

    }

    public static void displayRectangle(Rectangle rect) {

        System.out.println("Length: " + rect.getLength() + " - Width: " + rect.getWidth());
    }

    public static Rectangle GetBiggerRectangle(Rectangle rect1, Rectangle rect2) {
        if (rect1.getArea() > rect2.getArea()) {
            return rect1;
        } else {
            return rect2;
        }
    }
}
