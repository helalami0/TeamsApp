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
public class Profile implements java.io.Serializable{
    
    private String name;
    private Status online_status;
    private String status_message;
    
    public Profile(String name, String status_message){
        this.name = name;
        this.status_message = status_message;
        online_status = Status.AVAILABLE;
    }
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public Status getOnline_status() {
        return online_status;
    }

    
    public void setOnline_status(Status online_status) {
        this.online_status = online_status;
    }

    
    public String getStatus_message() {
        return status_message;
    }

    
    public void setStatus_message(String status_message) {
        this.status_message = status_message;
    }
    @Override
    public String toString() {
        return "name: " + this.name +", online_status: " + this.online_status +", status_message " + this.status_message;
    }
}
