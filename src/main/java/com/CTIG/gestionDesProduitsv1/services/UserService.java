package com.CTIG.gestionDesProduitsv1.services;

import java.util.List;

import com.CTIG.gestionDesProduitsv1.Exception.RessourceNotFoundException;
import com.CTIG.gestionDesProduitsv1.domain.User;


public interface UserService {

	public User saveUser(User user);
	public List<User> getAllUsers();
	public User getUserById(Long id)throws RessourceNotFoundException;
	public String DeleteUserById(Long id)throws RessourceNotFoundException;

}
