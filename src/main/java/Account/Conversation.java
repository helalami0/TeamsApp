/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;
import Channel.Attachment;
import Channel.Post;
import Channel.PostCollection;
import Channel.TextMessage;

import java.util.ArrayList;
/**
 *
 * @author Hachem
 */
public class Conversation implements java.io.Serializable{
    private int senderID;
    private int targetID; //if 0, target is a channel
    private PostCollection posts = new PostCollection();

    public Conversation(int SenderID, Post post){
        this.senderID = SenderID;
        this.targetID = 0;
        posts.add(post);
    }

    public Conversation(int senderID, int targetID){
        this.senderID = senderID;
        this.targetID = targetID;
    }

    public void postMessage(String message){
        Post post = new TextMessage(senderID, message);
        posts.add(post);
    }
    public void postAttachment(String path){
        Post post = new Attachment(senderID, path);
    }
    public PostCollection getPosts(){
        return posts;
    }
    public void reply(){
        
    }
    void edit_post(){
        
    }
    public int getSenderID(){return senderID;}
    public int getTargetID(){
        return targetID;
    }

    @Override
    public String toString() {
        return "Sender ID: " + senderID + " Target Id: " + targetID + " Post: " + posts;
    }
}
