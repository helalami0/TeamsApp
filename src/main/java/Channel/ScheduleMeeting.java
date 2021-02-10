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
public class ScheduleMeeting implements java.io.Serializable{

    private GregorianCalendar startDate;
    private GregorianCalendar endDate;
    private Repeat repeat_meeting;
    private String title;
    private boolean in_progress;

    
    public ScheduleMeeting(GregorianCalendar startDate, GregorianCalendar endDate,String title){
        this.startDate = startDate;
        this.endDate = endDate;
        this.repeat_meeting = Repeat.WEEKLY;
        this.title = title;
        this.in_progress = false;
    }
    
    void start(){
        this.setIn_progress(true);
    }
    void end(){
        this.setIn_progress(false);
    }
     public GregorianCalendar getStartDate() {
        return startDate;
    }

    
    public void setStartDate(GregorianCalendar startDate) {
        this.startDate = startDate;
    }

    
    public GregorianCalendar getEndDate() {
        return endDate;
    }

   
    public void setEndDate(GregorianCalendar endDate) {
        this.endDate = endDate;
    }

    
    public Repeat getRepeat_meeting() {
        return repeat_meeting;
    }

    
    public void setRepeat_meeting(Repeat repeat_meeting) {
        this.repeat_meeting = repeat_meeting;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public boolean isIn_progress() {
        return in_progress;
    }

    
    public void setIn_progress(boolean in_progress) {
        this.in_progress = in_progress;
    }

    
    @Override
    public String toString() {
        return "startDate: " + this.startDate +", endDate: " + this.endDate +", repeat_meeting: " + this.repeat_meeting + ", title: " + this.title + ", in_progress: " + this.in_progress;
    }
}
