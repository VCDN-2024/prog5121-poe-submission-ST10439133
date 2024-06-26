/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partone;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest 
{
    
    @Test
        public void TestingUsernametrue()
        {
            login Login = new login();
            assertEquals(true, (Login.checkUsername("Kyl_1")));
        }
        
        @Test
            public void testingUsernametrue()
            {
                login Login = new login();
                assertTrue(Login.checkUsername("Kyl_1"));
            }
            
            @Test
                public void testingUsernameFalse()
                {
                    login Login = new login ();
                    assertEquals(Login.checkUsername("kyle!!!!!!!"));
                   
                }
                
                @Test
                    public void TestingPasswordtrue()
                    {
                        login Login = login();
                        assertEquals(true,(Login.checksPasswordComplexity("Ch&&sec@ke99!")));
                    }
                    
                    @Test
                    public void TestingPasswordtrue()
                    {
                        login Login = new login();
                        assertTrue(Login.checkPasswordComplexity("Ch&&sec@ke99!"));
                    }
                    
                        @Test
                        public void TestingPasswordFalse()
                        {
                            login Login = new login();
                            assertEquals(false,(Login.checksPasswordComplexity("password")));
                        }
                        
                            @Test
                            public void TestingPasswordFalse()
                            {
                                login Login = new login ();
                                assertFalse(Login.checkPasswordComplexity("password"));
                            }
    
@Test
public void TestLoginTrue()
{
    login Login = new login();
    String username1 = "Kyl_1";
    String password1 = "Ch&&sec@ke99!";
    
    login.Username = username1;
    login.password = password1;
    
    boolean loginResult = login.loginUser(username1, password1);
    
    assertTrue(loginResults);
}

@Test
public void TestLoginFalse()
{
        login Login = new login();
        String username1 = "Kyl_1";
        String password1 = "Ch&&sec@ke99!";
        
        login.Username = username1;
        String password = password1;
        
        boolean loginResult = Login.loginUser(Username2, Password2);
        
        assertFalse(loginResult);
}

}

