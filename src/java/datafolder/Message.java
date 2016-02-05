/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datafolder;

import APIresources.TimeResources;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kimmo
 */
@XmlRootElement
public class Message {

    private int id;
    private String content;
    private String postTitle;
    private String postName;
    private String currentTime;

    public Message() {}

    public Message(int id, String c,String t, String n) {
        this.id = id;
        this.content = c;
        this.postTitle = t;
        this.postName = n;
        this.currentTime = TimeResources.getInstance().getTimestamp();
    }

    @XmlElement
    public int getID() {
        return id;
    }

    @XmlElement
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @XmlElement
    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
    
    @XmlElement
    public String getPostTitle(){
        return postTitle;
    }
        
    @XmlElement
    public String getCurrentTime(){
        return this.currentTime;
    }
}
