/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;
import Channel.ScheduleMeeting;

/**
 *
 * @author Hachem
 */
public class InvitationReply implements java.io.Serializable{

   
    
    private boolean accepted;
    private String comments;
    private Account account;
    private ScheduleMeeting scheduledMeeting;
    
    public InvitationReply(){
        
    }
    public boolean isAccepted() {
        return accepted;
    }

    
    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    
    public String getComments() {
        return comments;
    }

    
    public void setComments(String comments) {
        this.comments = comments;
    }

   
    public Account getAccount() {
        return account;
    }

    
    public void setAccount(Account account) {
        this.account = account;
    }

    
    public ScheduleMeeting getScheduledMeeting() {
        return scheduledMeeting;
    }

    
    public void setScheduledMeeting(ScheduleMeeting scheduledMeeting) {
        this.scheduledMeeting = scheduledMeeting;
    }
    @Override
    public String toString() {
        return "accepted: " + this.accepted +", comments: " + this.comments +", account " + this.account + ", scheduledMeeting: " + this.scheduledMeeting;
    }
}
