/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jacks
 */
public class MainTest {
    
    public MainTest() {
    }

    /**
     * Test of main method, of class Main.
     */
 
    /**
     * Test of calculateLifeInsurance method, of class Main.
     */
    @Test
    public void testCalculateLifeInsurance() throws Exception {
        System.out.println("calculateLifeInsurance");
        int age = 33;
        double expResult = 465.0;
        double result = Main.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
    
    }
     @Test
    public void testThatExceptionThrown() throws Exception {
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Main.calculateLifeInsurance(2);
        });
    }
}
