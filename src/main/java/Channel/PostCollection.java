package Channel;

import java.util.ArrayList;

public class PostCollection implements java.io.Serializable{
    private ArrayList<Post> Posts = new ArrayList<Post>();
    public PostCollection(){
    }
    public void add(Post post){
        Posts.add(post);
    }
    public ArrayList<Post> search(int ID){
        ArrayList<Post> foundPosts = new ArrayList<Post>();
        for(Post post:Posts){
            if(post.getSenderID() == ID){
                foundPosts.add(post);
            }
        }
        if(!foundPosts.isEmpty()){return foundPosts;}
        else return null;
    }
    public String toString(){
        return Posts.toString();
    }
}
