/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partone;

import javax.swing.JOptionPane;

public class PartOne 
{

    public static void main(String[] args) 
    {
        String Name = JOptionPane.showInputDialog(null, "Please enter your Name: ");
        String Surname = JOptionPane.showInputDialog("Please enter your Surname: ");

        String makeUsername = JOptionPane.showInputDialog(null, "Please enter your Username: \n "
                + "-Must be longer than 5 characters \n"
                + "-Must include an underscore (_) ");

        String makePassword = JOptionPane.showInputDialog(null, "Please enter a password \n "
                + "-Must be at least 8 characters long \n" + "-Must have an uppercase letter \n"
                + "-Must have a number \n" + "-Must have a special character");

        login Login = new login(makeUsername, makePassword, Name, Surname);
        JOptionPane.showMessageDialog(null, Login.registerUser());
        JOptionPane.showMessageDialog(null, Login.returnLoginStatus());

    }

}
