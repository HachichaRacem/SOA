package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    // Les attributs de la classe Compte.
    private int code;
    private double solde;

    @XmlTransient
    private Date date;

    // Constructeur sans paramètres.
    public Compte(){

    }

    // Constructeur parametré.
    public Compte(int code, double solde, Date date){
        this.code = code;
        this.solde = solde;
        this.date = date;
    }

    // Getters.
    public int getCode() {
        return code;
    }
    public double getSolde() {
        return solde;
    }
    public Date getDate() {
        return date;
    }

    // Setters.
    public void setCode(int code) {
        this.code = code;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}