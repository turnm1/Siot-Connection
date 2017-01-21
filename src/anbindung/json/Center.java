/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anbindung.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 *
 * @author Turna
 */
public class Center {
    
    
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("privacy")
    @Expose
    private Boolean privacy;
    @SerializedName("buildID")
    @Expose
    private String buildID;
    @SerializedName("userID")
    @Expose
    private String userID;

    public void setBuildID(String buildID) {
        this.buildID = buildID;
    }

    public void setPrivacy(boolean privacy) {
        this.privacy = privacy;
    }
   
    public void setAuthor(Author author) {
        this.author = author;
    }


    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getBuildID() {
        return buildID;
    }
 
    public Author getAuthor() {
        return author;
    }

    public boolean getPrivacy() {
        return privacy;
    }


    public String getUserID() {
        return userID;
    }

    public Center(String buildID, String userID, boolean privacy, Author author) {
        this.buildID = buildID;
        this.userID = userID;
        this.privacy = privacy;
        this.author = author;
    }
    
}
