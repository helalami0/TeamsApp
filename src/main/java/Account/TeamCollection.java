package Account;

import Channel.Channel;
import Channel.ChannelCollection;
import static Guis.CRUDTeamPanel.Accounts;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TeamCollection {
    private ArrayList<Team> Teams = new ArrayList<Team>();
    public TeamCollection(){

    }
    public void createTeam(String name, int ID){
        Team t = new Team(name, ID);
        Teams.add(t);
    }
    public void add(Team t){
        Teams.add(t);
    }
    public Team search(String name, int OwnerID){
        for(Team t:Teams){
            if(t.getName().equals(name) && t.getOwnerID() == OwnerID){
                return t;
            }
        }
        return null;
    }
    public void deleteTeam(String name, int ID){
        Team delTeam = search(name, ID);
        Teams.remove(delTeam);
    }
    public String toString(){
        return Teams.toString();
    }
    public ArrayList<Team> getTeams(){
        return Teams;
    }
    public ChannelCollection getAllChannels(){
        ChannelCollection ch = new ChannelCollection();
        ArrayList<Channel> teamChannels = new ArrayList<>();
        for(Team t: Teams){
            teamChannels = t.getChannels().getChannels();
            for(Channel c:teamChannels){
                ch.add(c);
            }
        }
        return ch;
    }
    public String[] getTeamNames(){
        String[] teamNames = new String[Teams.size()];
        for(int i = 0; i<Teams.size(); i++){
            teamNames[i] = Teams.get(i).getName();
        }
        return teamNames;
    }
    public void save(){
        try{
            String pathToHome = System.getProperty("user.home");
            File myObj = new File(pathToHome+"/msTeams.ser");
            FileOutputStream fout = new FileOutputStream(pathToHome+"/msTeams.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(Teams);
            oos.close();
            fout.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("Error initializing stream");
        } 
    }
    public void load() throws FileNotFoundException, IOException{
        String pathToHome = System.getProperty("user.home");
        File file = new File(pathToHome+"/msTeams.ser");
        if(file.exists()){
            if(file.length() == 0){
                Accounts.createAccount("Helalami", "Password", "AccountName", "Hello");
                Account connectedAccount = Accounts.search("Helalami", "Password");
                connectedAccount.createTeam("Java");
                connectedAccount.createTeam("Algorithms");
                connectedAccount.createTeam("DataStructures");
                connectedAccount.getTeam("Java", 1).newChannel("Main", "Hello main channel");
                connectedAccount.getTeams().save();
            }
            FileInputStream fi = new FileInputStream(pathToHome+"/msTeams.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            try {
                Teams = (ArrayList<Team>)oi.readObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TeamCollection.class.getName()).log(Level.SEVERE, null, ex);
            }
            catch(FileNotFoundException e){
                System.out.println("File not found");
            }
            catch (IOException e) {
                System.out.println("Error initializing stream");
            } 
        }
        else{
            file.createNewFile();
            Accounts.createAccount("Helalami", "Password", "AccountName", "Hello");
            Account connectedAccount = Accounts.search("Helalami", "Password");
            connectedAccount.createTeam("Java");
            connectedAccount.createTeam("Algorithms");
            connectedAccount.createTeam("DataStructures");
            connectedAccount.getTeam("Java", 1).newChannel("Main", "Hello main channel");
            connectedAccount.getTeams().save();
        }
        
    }
}
