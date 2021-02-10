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
public class Attachment extends Post implements java.io.Serializable{

    private String file_path;

    
    public Attachment(int ID, String file_path){
        super(ID);
        this.file_path = file_path;
    }

    public String getFile_path() {
        return file_path;
    }

    
    public void setFile_path(String file_path) {
        this.file_path = file_path;
    }

    @Override
    public String toString() {
        return super.toString() + " file path: " + this.file_path;
    }

}