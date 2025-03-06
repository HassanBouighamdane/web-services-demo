package com.exemple.test;

import com.exemple.ws.BanqueService;
import com.exemple.ws.BanqueWS;
import com.exemple.ws.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxyWS=new BanqueWS().getBanqueServicePort();
        double res=proxyWS.conversionEuroToDH(900);
        System.out.println(res);
        System.out.println("The list of comptes");
        List<Compte> comptes=proxyWS.getComptes();
        comptes.forEach(c-> {
                    System.out.println("Compte code: " + c.getCode());
                    System.out.println("Compte solde: " + c.getSolde());
                    System.out.println("Compte date de création: " + c.getDateCreation());
                    System.out.println("----------------------------------------");
                }
        );

    }
}
