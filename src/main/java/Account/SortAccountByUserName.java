package Account;


import java.util.Comparator;

public class SortAccountByUserName implements Comparator<Account>, java.io.Serializable{
    public int compare(Account a, Account b){
        return a.getUserName().compareTo(b.getUserName());
    }
}
