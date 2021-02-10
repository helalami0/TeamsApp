/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Hachem
 */
public class ShortPasswordException extends Exception implements java.io.Serializable{
    public ShortPasswordException(String password){
        super("Your password: " + password + " is too short, a minimum of 5 characters is required");
    }
    public int missingCharacters(String password){
        return 5-password.length();
    }
}
