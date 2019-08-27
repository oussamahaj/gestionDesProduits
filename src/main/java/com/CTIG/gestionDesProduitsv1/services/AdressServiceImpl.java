package com.CTIG.gestionDesProduitsv1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CTIG.gestionDesProduitsv1.Exception.BadRequestException;
import com.CTIG.gestionDesProduitsv1.Exception.RessourceNotFoundException;
import com.CTIG.gestionDesProduitsv1.Repositories.AdressRepository;
import com.CTIG.gestionDesProduitsv1.domain.Adresse;
import com.CTIG.gestionDesProduitsv1.domain.User;



@Service
public class AdressServiceImpl implements AdressService {

	@Autowired
	private AdressRepository adressRepository;
	@Autowired
	private UserService userService;

	@Override
	public Adresse saveAdresse(Adresse adresse) throws RessourceNotFoundException {

		User user = userService.getUserById(adresse.getUserId());
		adresse.setUser(user);
		return adressRepository.save(adresse);
	}

	@Override
	public List<Adresse> getAllAdresses() {
		// TODO Auto-generated method stub
		return adressRepository.findAll();
	}

	@Override
	public Adresse getAdresseById(Long id) throws RessourceNotFoundException {
		// TODO Auto-generated method stub
		return adressRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("ADRESS NOT FOUND"));
	}

	@Override
	public String deleteAdresseById(Long id) throws RessourceNotFoundException {
		// TODO Auto-generated method stub
		Adresse adresse = adressRepository.findById(id)
				.orElseThrow(() -> new RessourceNotFoundException("ADRESS NOT FOUND"));
		adressRepository.delete(adresse);
		return "USER DELETED WITH SUCCESS";
	}

	@Override
	public Adresse updateAdress(Adresse adresse) throws BadRequestException {
		if(adresse.getId()!=null ) {
			return adressRepository.save(adresse); // TODO Auto-generated method stub
		}
		else {
			throw new BadRequestException("BAD REQUEST TO UPDATE ADRESS CAUSED BY INEXIQTANT ID");
		}// TODO Auto-generated method stub
		
	}
	

}
