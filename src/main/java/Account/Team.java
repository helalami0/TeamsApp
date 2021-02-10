/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;
import Channel.*;
import java.util.Arrays;
/**
 *
 * @author Hachem
 */
public class Team implements java.io.Serializable{

    private String name;
    private ChannelCollection channels = new ChannelCollection();
    private AccountCollection members = new AccountCollection();
    private int OwnerID;
    
    public Team(String name, int id){
        this.name = name;
        this.OwnerID = id;
    }

    public void addMember(Account member){
        members.add(member);
    }
    public void addMember(String userName, String pass, String Name, String Status){
        members.createAccount(userName, pass, Name, Status);
    }
    public Account getMember(String userName, String Password){
        return members.search(userName, Password);
    }
    public void remove_member(Account member){
        members.deleteAccount(member.getUserName(), member.getPassword());
    }
    public void removeMember(String userName, String password){
        members.deleteAccount(userName, password);
    }

    public void newChannel(String name, String description){
        channels.createChannel(name, description);
    }
    public void newChannelSet(String name, String description, boolean a, boolean b, boolean c){
        channels.createChannelSet(name, description, a, b, c);
    }
    
    public Channel getChannel(String name){
        return channels.search(name);
    }
    public ChannelCollection getChannels(){
        return channels;
    }

    public void deleteChannel(String name){
        channels.deleteChannel(name);
    }
    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

        
    public int getOwnerID() {
        return OwnerID;
    }

    
    public void setOwner(int OwnerID) {
        this.OwnerID = OwnerID;
    }

    @Override
    public String toString() {
//        return "Team name: " + this.name +", channels: " + channels +", members " + members + ", owner ID: " + this.OwnerID;
        return this.name;
    }
}
