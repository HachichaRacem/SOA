package org.example.HachichaRacem_LSI3_SOA_TP6;

import org.example.HachichaRacem_LSI3_SOA_TP6.entities.Compte;
import org.example.HachichaRacem_LSI3_SOA_TP6.entities.EtatCompte;
import org.example.HachichaRacem_LSI3_SOA_TP6.entities.TypeCompte;
import org.example.HachichaRacem_LSI3_SOA_TP6.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HachichaRacemLsi3SoaTp6Application {

	public static void main(String[] args) {
		SpringApplication.run(HachichaRacemLsi3SoaTp6Application.class, args);
	}
@Bean
	public CommandLineRunner start(CompteRepository compt){
		return args -> {

			// L'ajout de trois comptes de types différents : 2 comptes épargne et 1 compte courant
			compt.save(new Compte(null, 150.0, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE));
			compt.save(new Compte(null, 500.0, new Date(), TypeCompte.EPARGNE, EtatCompte.ACTIVE));
			compt.save(new Compte(null, 250.0, new Date(), TypeCompte.COURANT, EtatCompte.CREE));

			// Boucle pour afficher les soldes des comptes enregistrés
			compt.findAll().forEach(c -> {
				System.out.println(c.getSolde());
			});
		};
	}

}
