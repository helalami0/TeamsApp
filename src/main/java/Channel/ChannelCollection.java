package Channel;

import Account.Account;

import java.util.ArrayList;
import java.util.Collections;

public class ChannelCollection implements java.io.Serializable{
    private ArrayList<Channel> Channels = new ArrayList<Channel>();
    public ChannelCollection(){

    }
    public void createChannel(String name, String description){
        Channel ch = new Channel(name, description);
        Channels.add(ch);
    }
    public void createChannelSet(String name, String description, boolean a, boolean b, boolean c){
        Channel ch = new Channel(name, description, a, b, c);
        Channels.add(ch);
    }
    public void add(Channel ch){
        Channels.add(ch);
    }
    public ArrayList<Channel> searchChannelsByKeyword(String keyword){
        ArrayList<Channel> foundChannels = new ArrayList<Channel>();
        for(Channel ch: Channels){
            if(ch.getChannel_name().toLowerCase().contains(keyword.toLowerCase())){
                foundChannels.add(ch);
            }
        }
        return foundChannels;
    }
    public Channel search(String name){
        for(Channel ch:Channels){
            if(ch.getChannel_name().equals(name)){
                return ch;
            }
        }
        return null;
    }
    public void deleteChannel(String name){
        Channel delC = search(name);
        Channels.remove(delC);
    }
    public void sort(){
        Collections.sort(Channels);
    }
    public ArrayList<Channel> getChannels(){
        return Channels;
    }
    public String toString(){
        return Channels.toString();
    }
}
