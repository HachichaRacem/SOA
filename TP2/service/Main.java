package service;

public class Main {
	public static void main(String[] args) {
		BanqueService bq = new BanqueService();
		bq.getComptes().add(new Compte(12,12,"2023-05-12"));
		System.out.println(bq.conversion(1));
		System.out.println(bq.getCompte(0));
	}
}
