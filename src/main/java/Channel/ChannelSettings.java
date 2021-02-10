/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Channel;

/**
 *
 * @author Hachem
 */
public class ChannelSettings implements java.io.Serializable{

    
    
    private boolean mention_allowed;
    private boolean everybody_can_post;
    private boolean can_edit_own_messages;
    
    public ChannelSettings(boolean m, boolean e, boolean c){
        mention_allowed = m;
        everybody_can_post = e;
        can_edit_own_messages = c;
    }
    public boolean isMention_allowed() {
        return mention_allowed;
    }

   
    public void setMention_allowed(boolean mention_allowed) {
        this.mention_allowed = mention_allowed;
    }

    
    public boolean isEverybody_can_post() {
        return everybody_can_post;
    }

    
    public void setEverybody_can_post(boolean everybody_can_post) {
        this.everybody_can_post = everybody_can_post;
    }

    
    public boolean isCan_edit_own_messages() {
        return can_edit_own_messages;
    }

    
    public void setCan_edit_own_messages(boolean can_edit_own_messages) {
        this.can_edit_own_messages = can_edit_own_messages;
    }
    @Override
    public String toString() {
        return "mention_allowed: " + this.mention_allowed +", everybody_can_post: " + this.everybody_can_post +", can_edit_own_messages " + this.can_edit_own_messages;
    }
}
