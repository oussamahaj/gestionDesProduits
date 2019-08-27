package com.CTIG.gestionDesProduitsv1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CTIG.gestionDesProduitsv1.Exception.RessourceNotFoundException;
import com.CTIG.gestionDesProduitsv1.Repositories.ProduitRepository;
import com.CTIG.gestionDesProduitsv1.domain.Produit;
import com.CTIG.gestionDesProduitsv1.domain.User;
@Service
public class ProduitServiceImpl implements ProduitService  {

	@Autowired
	private ProduitRepository produitRepositiry;
	@Autowired
	private UserService userService;

	@Override
	public Produit saveProduit(Produit produit) throws RessourceNotFoundException {
		User user = userService.getUserById(produit.getUserId());
		produit.setUser(user);
		// TODO Auto-generated method stub
		return produitRepositiry.save(produit);
	}
	@Override
	public List<Produit> getAllProduits() {
		// TODO Auto-generated method stub
		return produitRepositiry.findAll();
	}
	@Override
	public Produit getProduitById(String id) throws RessourceNotFoundException {
		// TODO Auto-generated method stub
		return produitRepositiry.findById(id).orElseThrow(() -> new RessourceNotFoundException("PRODUIT not Found"));
	}
	@Override
	public String DeleteProduitById(String id) throws RessourceNotFoundException {
		Produit produit =produitRepositiry.findById(id).orElseThrow (()->new RessourceNotFoundException("RODUIT not Found"));
		produitRepositiry.delete(produit);
		return null;
	}

}
