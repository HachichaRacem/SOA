package org.example.HachichaRacem_LSI3_SOA_TP6.repositories;

import org.example.HachichaRacem_LSI3_SOA_TP6.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

// Cette interface est le référentiel des comptes bancaires
public interface CompteRepository extends JpaRepository<Compte, Long> {

}
