/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
public class login 
{
    private String username;
    private String password;
    private String name;
    private String surname;
    private String Login = "";
    private String Password = "";
      
      public login(String username, String password, String name, String surname)
      {
          this.username = username;
          this.password = password;
          this.name = name;
          this.surname = surname;
      }
      
      public boolean checkUsername (String username)
      {
         if(username.length() <=5 && username.contains ("_"))
      {
          return true;
      }
      else
      {
          return false;
      }
}

    
public boolean checkPasswordComplexity(String password)
{
boolean passwordSpecialChar = false;
boolean passwordNum = false;
boolean lengthOfPassword = false;
boolean passwordUpperCase = false;

lengthOfPassword = password.length() >=8;
if (lengthOfPassword)
  {
    for (int i = 0; i < password.length(); i++)
    {
        char character = password.charAt (i);
        
        if(Character.isUpperCase(character))
        {
            passwordUpperCase = true;
        }
        if(Character.isDigit(character))
        {
            passwordNum = true;
        }
        if(!(Character.isLetterOrDigit(character)))
        {
            passwordSpecialChar = true;
        }
    }
  }
 return passwordSpecialChar && passwordNum && lengthOfPassword && passwordUpperCase;
}





public String registerUser()
{

  if(checkUsername (username) && checkPasswordComplexity (password))
    {
      String userLogin = JOptionPane.showInputDialog(null, "Login Account\n" + "Please enter your username");
      String userPassword = JOptionPane.showInputDialog(null, "Login Account\n" + "Please enter your password");
          return "Username successfuly captured and password successfully captured";
    }

        else
        {
            if(!checkUsername (username))
                {
                return "Username is not \n" +
                       "correctly formatted, \n" +
                       "please ensure that \n" +
                       "your username \n" +
                       "contains an \n" +
                       "underscore and is no \n" +
                       "more than 5 \n" + 
                       "character in length.";
                }
                    if(!checkPasswordComplexity(password))
                        {
                             return "password is not \n" +
                                    "correctly formatted, \n" +
                                    "please ensure that \n" +
                                    "the password \n" +
                                    "contains at least 8 \n" +
                                    "characters, a capital \n" +
                                    "letter, a number and \n" +
                                    "a special character";
                        }
                        return null;
        }
}


public boolean loginUser()
    {
            if(userLogin.equals(username) && userPassword.equals(password))
            {
                return true;
            }
             else
            {
                 return false;
            }
    }


public String returnLoginStatus()
    {
        if(loginUser())
        {
            return "Hello" + name + " " + surname + "." + "Welcome Back";
        }

        else
        {
            return "Username or Password is invalid, please try again";
        }
    }
}


