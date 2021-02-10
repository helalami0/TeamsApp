/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Channel;
import Account.Conversation;
import Account.ConversationCollection;

import java.util.GregorianCalendar;

/**
 *
 * @author Hachem
 */
public class Channel implements Comparable<Channel>, java.io.Serializable{

    private String channel_name;
    private String description;
    private ChannelSettings settings;
    private ConversationCollection conversations = new ConversationCollection();
    private File file;
    private ScheduleMeeting scheduleMeeting;
    
    public Channel(String channel_name, String description){
        this.channel_name = channel_name;
        this.description = description;
        this.settings = new ChannelSettings(true, true, true);
    }
    public Channel(String channel_name, String description, boolean a, boolean b, boolean c){
        this.channel_name = channel_name;
        this.description = description;
        this.settings = new ChannelSettings(a, b, c);
    }
    public String getChannel_name() {
        return channel_name;
    }
    public void newScheduleMeeting(GregorianCalendar startDate, GregorianCalendar endDate, String Name){
        scheduleMeeting = new ScheduleMeeting(startDate, endDate, Name);
    }
    public void newCustomMeeting(GregorianCalendar startDate, GregorianCalendar endDate, String Name, int[] days){
        scheduleMeeting = new CustomMeeting(startDate, endDate, Name, days);
    }
    
    public void setChannel_name(String channel_name) {
        this.channel_name = channel_name;
    }

    
    public String getDescription() {
        return description;
    }

    
    public void setDescription(String description) {
        this.description = description;
    }

    
    public ChannelSettings getSettings() {
        return settings;
    }

    
    public void setSettings(ChannelSettings settings) {
        this.settings = settings;
    }


    public void newMessageConversation(int ID, String text) {
        Post post = new TextMessage(ID, text);
        Conversation conv = new Conversation(ID, post);
        conversations.add(conv);
    }
    public ConversationCollection getConversations() {
        return conversations;
    }


    public File getFile() {
        return file;
    }

    
    public void setFile(File file) {
        this.file = file;
    }

    
    public ScheduleMeeting getScheduleMeeting() {
        return scheduleMeeting;
    }

    public int compareTo(Channel c){return this.channel_name.compareTo(c.getChannel_name());}

    public void setScheduleMeeting(ScheduleMeeting scheduleMeeting) {
        this.scheduleMeeting = scheduleMeeting;
    }
    @Override
    public String toString() {
//        return "channel_name: " + this.channel_name +", description: " + this.description +", settings " + this.settings + ", Conversations: " + this.conversations +  ", file" + this.file + ", scheduleMeeting" + this.scheduleMeeting;
        return this.channel_name;
    }
}
