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
public class TextMessage extends Post implements java.io.Serializable{

    private String text;

    
    public TextMessage(int ID, String text){
        super(ID);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return super.toString() + " text: " + this.text;
    }

}
