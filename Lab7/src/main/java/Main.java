/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
   import java.util.Scanner;
/**
 *
 * @author Jacks
 */
public class Main {
 



    public static void main(String[] args) throws InvalidAgeException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = keyboard.nextInt();

        double lifeInsuranceCost = calculateLifeInsurance(age);
        
        System.out.println("Your estimate is " + lifeInsuranceCost);
    }
    
    public static double calculateLifeInsurance(int age) throws InvalidAgeException {
        if (age < 5 || age > 110) { 
            throw new InvalidAgeException ("Age is invalid!");}
        
        double insuranceCost = (5 * age) + 300;
        return insuranceCost;
    }
}


