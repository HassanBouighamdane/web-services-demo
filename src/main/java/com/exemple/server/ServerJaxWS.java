package com.exemple.server;

import com.exemple.ws.BanqueService;

import javax.xml.ws.Endpoint;

public class ServerJaxWS {

    public static void main(String[] args) {
        String url="http://localhost:8088/";
        Endpoint.publish(url,new BanqueService());

        System.out.println("Web service deployé sur "+url);
    }
}
