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
public class WeakPasswordException extends Exception implements java.io.Serializable{
    public WeakPasswordException(String password){
        super("Password: " + password + " is too weak, add a capital letter.");
    }
}
