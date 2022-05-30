/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

/**
 *
 * @author ST10105643
 */
public class LoginTest 
{
    Login response = new Login();
    
    public LoginTest() 
    {
        
    }
@Test 
public void CheckPasswordComplexity()
{
 String expected = "Please enter Password";   
 String actual = response.ReturnLoginStatus(true); 
 assertEquals(expected,actual);
}
       
    @Test
    public void testReturnLoginStatus(String PW) 
    {
        int expected =50;
        boolean actual = response.CheckPasswordComplexity(PW);
        assertEquals(expected,actual);
    }
    
}
