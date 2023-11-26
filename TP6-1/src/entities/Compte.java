package org.example.HachichaRacem_LSI3_SOA_TP6.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
@Entity //  Indique que la classe représente une entité dans une base de données
@Getter // Utilisé pour générer des méthodes getter
@ToString // Utilisé pour générer la méthode toString
@NoArgsConstructor // Utilisé pour générer un constructeur sans argument
@AllArgsConstructor // Utilisé pour générer un constructeur qui prend tous les arguments possibles pour la classe
@Setter // Utilisé pour générer des méthodes setter
public class Compte {
    @Id // Représentant la clé primaire de l'entité (Primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ID est généré par la base de données en utilisant la stratégie GenerationType.IDENTITY
    private Long id;

    private double solde;
    private Date dateCreation;

    private TypeCompte type;
    private EtatCompte etat;
}

