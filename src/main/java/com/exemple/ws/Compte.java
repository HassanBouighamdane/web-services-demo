package com.exemple.ws;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name="compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {

    @XmlAttribute
    private Long code;
    @XmlElement
    private double solde;
    @XmlTransient
    private Date dateCreation;
    private boolean active;

    public Compte(){}
    public Compte( Long code,double solde,Date dateCreation, boolean active) {
        this.solde = solde;
        this.active = active;
        this.dateCreation = dateCreation;
        this.code = code;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
