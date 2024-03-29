/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guis;

import Account.Account;
import Account.AccountCollection;
import Account.Team;
import Channel.Channel;
import TeamsApp.Main;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hachem
 */

        
public class CRUDTeamPanel extends javax.swing.JPanel {
    DefaultListModel<Channel> model;
    public static AccountCollection Accounts = new AccountCollection();
    /**
     * Creates new form CRUDTeamPanel
     */
    public CRUDTeamPanel() {
        model = new DefaultListModel<>();
        Accounts.createAccount("Helalami", "Password", "AccountName", "Hello");
        Account connectedAccount = Accounts.search("Helalami", "Password");
        try {
            connectedAccount.getTeams().load();

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();
        channelsList.setModel(model);
        model.clear();
        String teamName = (String)teamsCollection.getSelectedItem();
        Team team = Accounts.search("Helalami", "Password").getTeams().search(teamName, 1);
        if(team == null) return;
        ArrayList<Channel> channels = team.getChannels().getChannels();
        if(channels == null) return;
        for(Channel ch: channels){
            model.addElement(ch);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        teamsCollection = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        channelsList = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        chanDescTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mention_allowedR = new javax.swing.JRadioButton();
        everybody_can_postR = new javax.swing.JRadioButton();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        chanNameTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        can_edit_own_messagesR = new javax.swing.JRadioButton();
        clearBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        teamsCollection.setModel(new javax.swing.DefaultComboBoxModel<>(Accounts.search("Helalami", "Password").getTeams().getTeamNames()));
        teamsCollection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamsCollectionActionPerformed(evt);
            }
        });

        channelsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        channelsList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                channelsListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(channelsList);

        jLabel2.setText("Description:");

        jLabel3.setText("Settings:");

        mention_allowedR.setText("Mention Allowed");
        mention_allowedR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mention_allowedRItemStateChanged(evt);
            }
        });
        mention_allowedR.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mention_allowedRStateChanged(evt);
            }
        });
        mention_allowedR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mention_allowedRActionPerformed(evt);
            }
        });

        everybody_can_postR.setText("Everybody Can Post");
        everybody_can_postR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                everybody_can_postRItemStateChanged(evt);
            }
        });

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Channel Name:");

        chanNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chanNameTxtActionPerformed(evt);
            }
        });

        can_edit_own_messagesR.setText("Can Edit Own Messages");
        can_edit_own_messagesR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                can_edit_own_messagesRItemStateChanged(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Teams:");

        jLabel5.setText("Channels:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(clearBtn)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chanNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chanDescTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mention_allowedR)
                                    .addComponent(everybody_can_postR)
                                    .addComponent(can_edit_own_messagesR)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(204, 204, 204))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teamsCollection, 0, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)
                        .addGap(36, 36, 36)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn)
                    .addComponent(jLabel1)
                    .addComponent(teamsCollection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chanNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(chanDescTxt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(mention_allowedR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(everybody_can_postR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(can_edit_own_messagesR)
                            .addComponent(clearBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)))
                .addGap(59, 59, 59)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(!channelsList.isSelectionEmpty()){
            JOptionPane.showMessageDialog(CRUDTeamPanel.this, "Please Clear First.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(chanNameTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(CRUDTeamPanel.this, "Channel Name is Empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(chanDescTxt.getText().isEmpty()){
            JOptionPane.showMessageDialog(CRUDTeamPanel.this, "Description is Empty.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String teamName = (String)teamsCollection.getSelectedItem();
        Team team = Accounts.search("Helalami", "Password").getTeams().search(teamName, 1);
        if(team.getChannel(chanNameTxt.getText()) != null){
            JOptionPane.showMessageDialog(CRUDTeamPanel.this, "Already Existing Channel Name.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String chanName = chanNameTxt.getText();
        String chanDesc = chanDescTxt.getText();
        boolean a = mention_allowedR.isSelected();
        boolean b = everybody_can_postR.isSelected();
        boolean c = can_edit_own_messagesR.isSelected();
        team.newChannelSet(chanName, chanDesc, a, b, c);
        model.addElement(team.getChannel(chanName));
        channelsList.setSelectedValue(team.getChannel(chanName), true);
    }//GEN-LAST:event_addBtnActionPerformed

    private void teamsCollectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamsCollectionActionPerformed
        // TODO add your handling code here:
        model.clear();
        String teamName = (String)teamsCollection.getSelectedItem();
        Team team = Accounts.search("Helalami", "Password").getTeams().search(teamName, 1);
        if(team == null) return;
        ArrayList<Channel> channels = team.getChannels().getChannels();
        if(channels == null) return;
        for(Channel ch: channels){
            model.addElement(ch);
        }
        channelsList.clearSelection();
        chanNameTxt.setEditable(true);
        chanDescTxt.setEditable(true);
        mention_allowedR.setEnabled(true);
        everybody_can_postR.setEnabled(true);
        can_edit_own_messagesR.setEnabled(true);
    }//GEN-LAST:event_teamsCollectionActionPerformed

    private void chanNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chanNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chanNameTxtActionPerformed

    private void channelsListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_channelsListValueChanged
        // TODO add your handling code here:
        if(evt.getValueIsAdjusting()) return;
        Channel chan = channelsList.getSelectedValue();
        if(chan == null){
            chanNameTxt.setText("");
            chanDescTxt.setText("");
            mention_allowedR.setSelected(false);
            everybody_can_postR.setSelected(false);
            can_edit_own_messagesR.setSelected(false);
            return;
        }
        chanNameTxt.setEditable(false);
        chanDescTxt.setEditable(false);
        chanNameTxt.setText(chan.getChannel_name());
        chanDescTxt.setText(chan.getDescription());
        //radio buttons 
        mention_allowedR.setEnabled(false);
        everybody_can_postR.setEnabled(false);
        can_edit_own_messagesR.setEnabled(false);
        mention_allowedR.setSelected(chan.getSettings().isMention_allowed());
        everybody_can_postR.setSelected(chan.getSettings().isEverybody_can_post());
        can_edit_own_messagesR.setSelected(chan.getSettings().isCan_edit_own_messages());
//        private boolean mention_allowed;
//            
//       private boolean everybody_can_post;
//    private boolean can_edit_own_messages;
        
    }//GEN-LAST:event_channelsListValueChanged

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        channelsList.clearSelection();
        chanNameTxt.setEditable(true);
        chanDescTxt.setEditable(true);
        chanNameTxt.setText("");
        chanDescTxt.setText("");
        mention_allowedR.setSelected(false);
        everybody_can_postR.setSelected(false);
        can_edit_own_messagesR.setSelected(false);
        mention_allowedR.setEnabled(true);
        everybody_can_postR.setEnabled(true);
        can_edit_own_messagesR.setEnabled(true);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if(channelsList.getSelectedValue() == null){
            JOptionPane.showMessageDialog(CRUDTeamPanel.this, "Please Select a Channel.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            String teamName = (String)teamsCollection.getSelectedItem();
            Team team = Accounts.search("Helalami", "Password").getTeams().search(teamName, 1);
            Channel chan = channelsList.getSelectedValue();
            team.deleteChannel(chan.getChannel_name());
            ArrayList<Channel> channels = team.getChannels().getChannels();
            model.clear();
            if(channels != null){
                for(Channel ch: channels){
                    model.addElement(ch);
                }
                channelsList.clearSelection();
                chanNameTxt.setEditable(true);
                chanDescTxt.setEditable(true);
                mention_allowedR.setEnabled(true);
                everybody_can_postR.setEnabled(true);
                can_edit_own_messagesR.setEnabled(true);
            }


            JOptionPane.showMessageDialog(CRUDTeamPanel.this, "Deleted", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        if(channelsList.isSelectionEmpty()){
            JOptionPane.showMessageDialog(CRUDTeamPanel.this, "Select a Channel", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String teamName = (String)teamsCollection.getSelectedItem();
        Team team = Accounts.search("Helalami", "Password").getTeams().search(teamName, 1);
 
        Channel chan = channelsList.getSelectedValue();
        chanNameTxt.setEditable(true);
        chanDescTxt.setEditable(true);
        mention_allowedR.setEnabled(true);
        everybody_can_postR.setEnabled(true);
        can_edit_own_messagesR.setEnabled(true);
        chanNameTxt.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                if(text.equals(chan.getChannel_name())) return;
                if(team.getChannel(chanNameTxt.getText()) != null){
                    JOptionPane.showMessageDialog(CRUDTeamPanel.this, " Already Existing Channel Name.", "Warning ", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else{
                    chan.setChannel_name(text);
                }
//                ArrayList<Channel> channels = team.getChannels().getChannels();
//                model.clear();
//                if(channels == null) return;
//                for(Channel ch: channels){
//                    model.addElement(ch);
//                }
//                channelsList.setSelectedValue(chan, true);
                
            }
        });
        chanDescTxt.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                JTextField textField = (JTextField) e.getSource();
                String text = textField.getText();
                chan.setDescription(text);
            }
        });
    }//GEN-LAST:event_editBtnActionPerformed

    private void mention_allowedRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mention_allowedRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mention_allowedRActionPerformed

    private void mention_allowedRStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mention_allowedRStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mention_allowedRStateChanged

    private void mention_allowedRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mention_allowedRItemStateChanged
        // TODO add your handling code here:
        Channel chan = channelsList.getSelectedValue();
        if(chan == null) return;
        if(evt.getStateChange() == ItemEvent.SELECTED){
            chan.getSettings().setMention_allowed(true);
        }
        else if(evt.getStateChange() == ItemEvent.DESELECTED){
            chan.getSettings().setMention_allowed(false);
        }
    }//GEN-LAST:event_mention_allowedRItemStateChanged

    private void everybody_can_postRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_everybody_can_postRItemStateChanged
        // TODO add your handling code here:
        Channel chan = channelsList.getSelectedValue();
        if(chan == null) return;
        if(evt.getStateChange() == ItemEvent.SELECTED){
            chan.getSettings().setEverybody_can_post(true);
        }
        else if(evt.getStateChange() == ItemEvent.DESELECTED){
            chan.getSettings().setEverybody_can_post(false);
        }
    }//GEN-LAST:event_everybody_can_postRItemStateChanged

    private void can_edit_own_messagesRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_can_edit_own_messagesRItemStateChanged
        // TODO add your handling code here:
        Channel chan = channelsList.getSelectedValue();
        if(chan == null) return;
        if(evt.getStateChange() == ItemEvent.SELECTED){
            chan.getSettings().setCan_edit_own_messages(true);
        }
        else if(evt.getStateChange() == ItemEvent.DESELECTED){
            chan.getSettings().setCan_edit_own_messages(false);
        }
    }//GEN-LAST:event_can_edit_own_messagesRItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JRadioButton can_edit_own_messagesR;
    private javax.swing.JTextField chanDescTxt;
    private javax.swing.JTextField chanNameTxt;
    private javax.swing.JList<Channel> channelsList;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JRadioButton everybody_can_postR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton mention_allowedR;
    private javax.swing.JComboBox<String> teamsCollection;
    // End of variables declaration//GEN-END:variables
}
