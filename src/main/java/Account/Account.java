/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.ArrayList;
import java.util.Arrays;
import Channel.*;
/**
 *
 * @author Hachem
 */
public class Account implements Comparable<Account>, java.io.Serializable{
    private static int count = 1;
    private int ID;
    private String userName;
    private String password;
    private Profile profile;
    private ConversationCollection conversations = new ConversationCollection();
    private TeamCollection Teams = new TeamCollection();
    
    public Account(String userName, String password, String name, String status_message) throws WeakPasswordException, ShortPasswordException{
        this.userName = userName;
        this.ID = count++;
        boolean upperCase = false;
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch)){
                upperCase = true;
                break;
            }
        }
        if(password.length()<5){
            throw new ShortPasswordException(password);
        }
        if(upperCase == false){
            throw new WeakPasswordException(password);
        }
        this.password = password;
        profile = new Profile(name, status_message);
    }
    void authenticate(){
        
    }
    void changePass(){
        
    }
    public void printAccount(){
        System.out.println();
    }

    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }

   
    public String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public Profile getProfile() {
        return profile;
    }

   
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public int getID(){return ID;}

    public void newConversation(int targetID){
        Conversation conversation = new Conversation(ID, targetID);
        conversations.add(conversation);
    }
    public ConversationCollection getConversations(){
        return conversations;
    }

    public void createTeam(String teamName){
        this.Teams.createTeam(teamName, this.ID);
    }
    public void addTeam(Team team){
        this.Teams.add(team);
    }
    
    public Team getTeam(String name, int OwnerID){
        return Teams.search(name, OwnerID);
    }
    public TeamCollection getTeams(){
        return Teams;
    }
    public int compareTo(Account acc){
        if(ID > acc.getID()){return 1;}
        else if(ID == acc.getID()){return 0;}
        else return -1;
    }
    
    @Override
    public String toString() {
        return "User ID: " + this.ID +" User Name: " + this.userName +", password: " + this.password +", profile " + this.profile + " teams: " + Teams + ", conversations: " + conversations;
    }
}