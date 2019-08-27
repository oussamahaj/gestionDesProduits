package com.CTIG.gestionDesProduitsv1.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CTIG.gestionDesProduitsv1.domain.Produit;

public interface ProduitRepository extends JpaRepository<Produit, String> {

}
