package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebService
public class BanqueService {
    @WebMethod
    public double conversion(@WebParam double m){ // Permettre de convertir un montant m Euros en TND.
        return m*3.3;
    }
    @WebMethod
    public List<Compte> getComptes(){ // Permettre de fournir une liste contenant deux comptes.
        List<Compte> comptes = new ArrayList<Compte>();
        comptes.add(new Compte(0, 500.0, new Date()));
        comptes.add(new Compte(1, 1520.0, new Date()));
        return comptes;
    }
}