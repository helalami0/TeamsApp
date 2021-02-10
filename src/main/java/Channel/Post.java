/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Channel;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import Account.Account;

/**
 *
 * @author Hachem
 */
public abstract class Post {
    private GregorianCalendar date;
    private int likes = 0;
    private int senderID;

    public Post(int ID){
        this.date = new GregorianCalendar();
        this.senderID = ID;
    }
    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }
  
    public int getLikes() {
        return likes;
    }

    public int getSenderID(){return senderID;}
    public void addLike() {
        this.likes++;
    }


    public String printDate(){
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd-MMM-yyyy");
        return formattedDate.format(date.getTime());
    }

    @Override
    public String toString() {
        return "Date: " + printDate() +", likes: " + this.likes;
    }
}
