package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServeurJWS {
    public static void main(String[] args) {
        // L'adresse à laquelle nous pourrions accéder à notre service
        String url = "http://localhost:8084/";
        // Déploiement du service.
        Endpoint.publish(url, new BanqueService());
    }
}