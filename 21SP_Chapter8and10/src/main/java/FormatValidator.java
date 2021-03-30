/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class FormatValidator {
    
    public static boolean IsValidEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean IsValidPhoneNumber(String phone) {
        //(785)-111-1111
        if (phone.contains("(") && phone.contains(")") && phone.contains("-") && phone.length() == 16) {
            return true;
        } else {
            return false;
        }
    }
    
}
