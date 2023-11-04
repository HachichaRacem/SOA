package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {

    public static  void main(String[] args){
        String url = "http://localhost:8084/";
        Endpoint.publish(url, new CalculatriceWS());
    }
}
