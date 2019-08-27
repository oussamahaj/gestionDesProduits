package com.CTIG.gestionDesProduitsv1.services;

import java.util.List;

import com.CTIG.gestionDesProduitsv1.Exception.BadRequestException;
import com.CTIG.gestionDesProduitsv1.Exception.RessourceNotFoundException;
import com.CTIG.gestionDesProduitsv1.domain.Adresse;



public interface AdressService  {
	public Adresse saveAdresse(Adresse adresse)throws RessourceNotFoundException;
	public List<Adresse> getAllAdresses();
	public Adresse getAdresseById(Long id) throws RessourceNotFoundException;
	public String deleteAdresseById(Long id)throws RessourceNotFoundException;
	public Adresse updateAdress(Adresse adresse) throws BadRequestException;
}
