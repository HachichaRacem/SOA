package client;

import proxy.BanqueService;
import proxy.BanqueServiceService;

public class ClientWS {
    public static void main(String[] args) {
        // Consommation des méthodes du service web
        BanqueService banqueService = new BanqueServiceService().getBanqueServicePort();
        System.out.println(banqueService.conversion(2.0));
        System.out.println(banqueService.getComptes());
    }
}
