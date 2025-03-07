package com.exemple.test;

import com.exemple.metier.Compte;
import com.exemple.metier.ListCompte;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.Date;

public class JaxBSerializationXML {
    public static void main(String[] args) throws JAXBException {
        //Compte cp=new Compte(1L,new Date(),9000);
        JAXBContext jaxbContext=JAXBContext.newInstance(ListCompte.class);
        Marshaller marchaller=jaxbContext.createMarshaller();
        marchaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        ListCompte listCompte =new ListCompte();
        /*
        marchaller.marshal(cp,new File("compte.xml"));
        marchaller.marshal(cp,System.out);

         */
        listCompte.addCompte(new Compte(1L,new Date(),9000));
        listCompte.addCompte(new Compte(2L,new Date(),8000));
        marchaller.marshal(listCompte,new File("listComptes.xml"));
        marchaller.marshal(listCompte,System.out);
    }
}
