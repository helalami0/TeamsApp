package Account;

import java.util.ArrayList;
import java.util.Collections;

public class AccountCollection implements java.io.Serializable{
    private ArrayList<Account> Accounts = new ArrayList<Account>();

    public AccountCollection(){
    }
    public void add(Account acc){
        Accounts.add(acc);
    }
    public void createAccount(String userName, String pass, String Name, String Status){
        Account account1;
        try{
            account1 = new Account(userName, pass, Name, Status );
            Accounts.add(account1);
        }
        catch(ShortPasswordException ex){
            System.err.println(ex.getMessage());
//                System.err.println("Add " + ex.missingCharacters(password) + " characters");
        }
        catch(WeakPasswordException ex){
            System.err.println(ex.getMessage());
        }
    }
    public Account search(String userName, String password){
        for(Account account:Accounts){
            if(account.getUserName().equals(userName)&&account.getPassword().equals(password)){
                return account;
            }
        }
        return null;
    }
    public void deleteAccount(String userName, String password){
        Account delAccount = search(userName, password);
        Accounts.remove(delAccount);
    }
    public void sortByID(){
        Collections.sort(Accounts);
    }
    public void sortByUserName(){
        Accounts.sort(new SortAccountByUserName());
    }
    public String toString(){
        return Accounts.toString();
    }
}
