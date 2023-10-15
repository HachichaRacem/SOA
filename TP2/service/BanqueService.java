package service;

import java.util.ArrayList;
import java.util.List;

public class BanqueService {
	List<Compte> comptes = new ArrayList<Compte>();
	public double conversion(double montant) {
		return 3.3*montant;
	}
	public Compte getCompte(int index) {
		return comptes.get(index);
	}
	public List<Compte> getComptes(){
		return comptes;
	}
}
