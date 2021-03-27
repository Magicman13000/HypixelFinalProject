/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author David Ruhlman
 */
public class MainTest {
    

    @Test
    public void testCalculateLifeInsurance() throws InvalidAgeException {
        System.out.println("calculateLifeInsurance");
        int age = 22;
        double expResult = 410;
        double result = Main.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateLifeInsurance2() throws InvalidAgeException {
        System.out.println("calculateLifeInsurance");
        int age = 5;
        double expResult = 325;
        double result = Main.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
    }
    
       @Test
    public void testCalculateLifeInsurance3() throws InvalidAgeException {
        System.out.println("calculateLifeInsurance");
        int age = 110;
        double expResult = 850;
        double result = Main.calculateLifeInsurance(age);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCalculateLifeInsuranceExceptionLow() throws InvalidAgeException {
        System.out.println("calculateLifeInsurance");
        Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Main.calculateLifeInsurance(4);
        });
    }
    
    @Test
    public void testCalculateLifeInsuranceExceptionHigh() throws InvalidAgeException {
        System.out.println("calculateLifeInsurance");
           Exception exception = assertThrows(InvalidAgeException.class, () -> {
            Main.calculateLifeInsurance(111);
        });
    }
    
}
