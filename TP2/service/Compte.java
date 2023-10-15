package service;

public class Compte {
	int code, solde;
	String dateCreation;
	
	public Compte(int code, int solde, String dateCreation) {
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public String toString() {
		return ("solde : " + solde + ", code : " + code + ", date de creation : " + dateCreation);
	}
	
	
}
