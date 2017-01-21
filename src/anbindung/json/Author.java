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
public class Author {
    
    @SerializedName("responsiblePerson")
    @Expose
    private String responsiblePerson;
    @SerializedName("telefon")
    @Expose
    private String telefon;
    @SerializedName("companyName")
    @Expose
    private String companyName;
    @SerializedName("companyLicence")
    @Expose
    private String companyLicence;
    @SerializedName("email")
    @Expose
    private String email;

    public void setCompanyLicence(String companyLicence) {
        this.companyLicence = companyLicence;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setResponsiblePerson(String responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getCompanyLicence() {
        return companyLicence;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getEmail() {
        return email;
    }

    public String getResponsiblePerson() {
        return responsiblePerson;
    }

    public String getTelefon() {
        return telefon;
    }

    public Author(String responsiblePerson, String companyName, String companyLicence, String telefon, String email) {
        this.responsiblePerson = responsiblePerson;
        this.companyName = companyName;
        this.companyLicence = companyLicence;
        this.telefon = telefon;
        this.email = email;
    }
    
}
