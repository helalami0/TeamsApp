package Account;

import java.util.ArrayList;

public class ConversationCollection implements java.io.Serializable{
    private ArrayList<Conversation> conversations = new ArrayList<Conversation>();
    public ConversationCollection(){

    }
    public void add(Conversation conv){conversations.add(conv);}
    public void add(int senderID, int targetID){
        Conversation conv = new Conversation(senderID, targetID);
        conversations.add(conv);
    }
    public String toString(){
        return conversations.toString();
    }
}
