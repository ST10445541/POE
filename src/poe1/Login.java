/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe1;

/**
 *
 * @author lab_services_student
 */
public class Login {

 public boolean checkUserName(String uname){
     
        boolean un = false; 
        boolean len = false; 
        boolean under = false; 

        
        
        for (int i = 0; i < uname.length(); i++) {
            if (uname.length()<=5) {
                len = true;
                
            }
            else {
                
            }
        }
        
        for (int i = 0; i < uname.length(); i++) {
            
            char p = uname.charAt(i);
            if (p == '_') {
                under = true;
            }
            else {
                
            }
        }
        if (len && under == true) {
            un = true;
        }
        else{
            un = false;
        }
        

        if (un == true) {
            System.out.println("Username successfully captured");
        }
        else{
            System.out.println("Username is not correctly formatted, please "
                    + "ensure that your username contains an underscore and is"
                    + " no longer than 5 characters in length ");
        }
        return un;
    }
    
    
    
    
    
    public boolean PasswordComplexity(String pass){
        boolean corr = false; 
        boolean len = false, cap = false, num = false, spe = false;
        
        if (pass.length()>8) {
            len = true;
        }
        else
        {
            
        }

        for (int i = 0; i < pass.length(); i++) {
            char k = pass.charAt(i);
            if (Character.isUpperCase(k)) {
                cap = true;
            }
            else{
               
            }
            
        }
        
        for (int i = 0; i < pass.length(); i++) {
                        char p = pass.charAt(i);

            if (Character.isDigit(p)) {
                num = true;
            }
            else{
                
            }
        }
        
        for (int i = 0; i < pass.length(); i++) {
            char pc = pass.charAt(i);
            String spCh = "/*!@#$%^&*()\\\"{}_[]|\\?/,.";
            for (int j = 0; j < spCh.length(); j++) {
                if (pc == spCh.charAt(j)) {
                    spe = true;
                }
                else{
                    
                }
                    
            }
            
        }
        
        if (len && cap && num && spe == true) {
            corr = true;
        }
        else
        {
            corr = false; 
        }
        
        
        if (corr == true) {
            System.out.println("Password successfully captured");
        }
        else{
            System.out.println("Password is not correctly formatted please "
     + "ensure that the password contains at least 8 characters, a capital"
                    + " letter, a number and a special character");
        }
        return corr; 
    }
    
    
   public String registerUser(String usn, String pas){
       
        boolean un = checkUserName(usn);
        boolean ps = PasswordComplexity(pas);
             
       String rt =  "";
       String reg1 = "The username is incorrectly formatted";
       String reg2 = "The password does not meet the complexity requirements";
       String reg3 = "The two above conditions have been met and the user has been registered successfully";
       
       if (un && ps == true) {
           rt = reg3;
           
       }
       
       if (un == false) {
           rt = reg1;
       }
       if (ps == false) {
           rt = reg2;
       }
       
       
       System.out.println(rt);
       return rt ;
      
   }    
    public Boolean loginUser(String us, String pas){
        Boolean lg = false; 
        String cUsr = "kyl_1";
        String cPass = "Ch&&sec@ke99!";
        if (us.equals(us) && pas.equals(cPass)) {
            lg = true;
        } else{
            lg = false;
        }
        
        
        return lg;
}
    
    public String returnLoginStatus(Boolean l){
       String lgStat;
       String msg1 = "Login successful";
       String msg2 = "Login failed";
       
        if (l==true) {
            lgStat = msg1;
        }
        else {
            lgStat = msg2;
        }
       
      return lgStat;
    }
    
    
}
