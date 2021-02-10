/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TeamsApp;
import Account.*;
import Channel.*;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hachem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        AccountCollection Accounts = new AccountCollection();
        Accounts.createAccount("Helalami", "Password", "AccountName", "Hello");
        Account connectedAccount = Accounts.search("Helalami", "Password");
        try {
            connectedAccount.getTeams().load();

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(connectedAccount.getTeams().getAllChannels());
    }
    
}
