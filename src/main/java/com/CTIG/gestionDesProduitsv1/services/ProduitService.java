package com.CTIG.gestionDesProduitsv1.services;

import java.util.List;

import com.CTIG.gestionDesProduitsv1.Exception.RessourceNotFoundException;
import com.CTIG.gestionDesProduitsv1.domain.Produit;


public interface ProduitService {

	public Produit saveProduit(Produit produit) throws RessourceNotFoundException;
	public List<Produit> getAllProduits();
	public Produit getProduitById(String id)throws RessourceNotFoundException;
	public String DeleteProduitById(String id)throws RessourceNotFoundException;
}
