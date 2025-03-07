package com.exemple.metier;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListCompte {
    @XmlElement(name = "compte")
    private List<Compte> comptes=new ArrayList<>();

    public ListCompte() {
    }
    public void addCompte(Compte cp){
        comptes.add(cp);
    }
    public List<Compte> getComptes() {
        return comptes;
    }
    public void setComptes(List<Compte> comptes) {
        this.comptes = comptes;
    }
}
