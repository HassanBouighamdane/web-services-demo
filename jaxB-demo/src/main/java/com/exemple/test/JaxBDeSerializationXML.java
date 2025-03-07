package com.exemple.test;

import com.exemple.metier.Compte;
import com.exemple.metier.ListCompte;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class JaxBDeSerializationXML {

    public static void main(String[] args) {
        try {

            JAXBContext jaxbContext = JAXBContext.newInstance(ListCompte.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ListCompte listCompte = (ListCompte) jaxbUnmarshaller.unmarshal(new File("listComptes.xml"));
            for (Compte compte : listCompte.getComptes()) {
                System.out.println(compte.toString());
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
