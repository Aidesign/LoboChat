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
 * @author Kasper
 */
@XmlRootElement
public class Alert {
    private int id;
    private String currentTime;
    @XmlElement
    private String alertCat;
    @XmlElement
    private String receiverGroup;
    @XmlElement
    private String postName;
    
    public Alert(){}

    //@XmlElement
    public int getID() {
        return id;
    }
    
    public void setID() {
        this.id = IDIncrement.getInstance().alertIncrement();
    }
    
    //@XmlElement
    public String getCurrentTime(){
        return this.currentTime;
    }
    
    public void setCurrentTime() {
        this.currentTime = TimeResources.getInstance().getTimestamp();
    }
    
    //@XmlElement
    public String getAlertCat() {
        return alertCat;
    }
    
    //@XmlElement
    public String getReceiverGroup(){
        return this.receiverGroup;
    }
    
    //@XmlElement
    public String getPostName() {
        return postName;
    }
}
