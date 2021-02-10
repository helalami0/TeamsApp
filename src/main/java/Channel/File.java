/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Channel;
import java.util.GregorianCalendar;
/**
 *
 * @author Hachem
 */
public class File implements java.io.Serializable{

    private boolean isDirectory;
    private String path;
    private String file_name;
    private GregorianCalendar last_update;
    
    public File(String path, String file_name){
        isDirectory = true;
        this.path = path;
        this.file_name = file_name;
        this.last_update = new GregorianCalendar();
    }
    public boolean isIsDirectory() {
        return isDirectory;
    }

    
    public void setIsDirectory(boolean isDirectory) {
        this.isDirectory = isDirectory;
    }

    
    public String getPath() {
        return path;
    }

    
    public void setPath(String path) {
        this.path = path;
    }

    
    public String getFile_name() {
        return file_name;
    }

    
    public void setFile_name(String file_name) {
        this.file_name = file_name;
    }

    
    public GregorianCalendar getLast_update() {
        return last_update;
    }

    
    public void setLast_update(GregorianCalendar last_update) {
        this.last_update = last_update;
    }
    @Override
    public String toString() {
        return "isDirectory: " + this.isDirectory +", path: " + this.path +", file_name " + this.file_name + ", last_update: " + this.last_update;
    }
}
