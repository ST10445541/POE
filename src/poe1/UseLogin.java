/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class UseLogin {
     public static void main(String[] args) {
        Login lg = new Login();
        String userN = JOptionPane.showInputDialog("Enter your username");
        lg.checkUserName(userN);
        String pass = JOptionPane.showInputDialog("Enter password");
        if (lg.loginUser(userN, pass)) {
            System.out.println("Welcome " + userN + pass + " it is great to see you again");
        } 
        
        else{
            System.out.println("Username or password incorrect");
        }
        lg.PasswordComplexity(pass);
        lg.registerUser(userN, pass);
        
        
        
    }
}
