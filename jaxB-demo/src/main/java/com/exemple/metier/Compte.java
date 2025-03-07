package com.exemple.metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    @XmlAttribute
    private Long id;
    private Date dateCreation;
    private double solde;

    public Compte() {
    }

    public Compte(Long id, Date date, double solde) {
        this.id = id;
        this.dateCreation = date;
        this.solde = solde;
    }

    public Long getId() {
        return id;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public double getSolde() {
        return solde;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", Date Creation='" + dateCreation + '\'' +
                ", solde=" + solde +
                '}';
    }
}
