/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Channel;

import java.util.GregorianCalendar;

/**
 *
 * @author Hachem
 */
public class CustomMeeting extends ScheduleMeeting implements java.io.Serializable{
    int[] days = new int[7]; 
    
    public CustomMeeting(GregorianCalendar startDate, GregorianCalendar endDate,String title, int[] days){
        super(startDate, endDate, title);
        this.days = days;
    }
    
    public void setDays(int[] days){
        this.days = days;
    }
    public int[] getDays(){
        return days;
    }
    public String getListDays(){
        String s = new String();
        for(int day:days){
            s += day + " ";
        }
        return s;
    }
    
    public String toString(){
        return super.toString() + " repeat on days: " + getListDays();
    }
}
