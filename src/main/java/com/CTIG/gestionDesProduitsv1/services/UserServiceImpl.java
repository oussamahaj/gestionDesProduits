package com.CTIG.gestionDesProduitsv1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CTIG.gestionDesProduitsv1.Exception.RessourceNotFoundException;
import com.CTIG.gestionDesProduitsv1.Repositories.UserRepository;
import com.CTIG.gestionDesProduitsv1.domain.User;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		user.getProfile().setUser(user);
		 ( user.getRole()).foreach().setUser(user);
		
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) throws RessourceNotFoundException {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElseThrow(() -> new RessourceNotFoundException("User not Found"));
	}

	@Override
	public String DeleteUserById(Long id) throws RessourceNotFoundException {
		User user= userRepository.findById(id).orElseThrow (()-> new RessourceNotFoundException("USER NOT FOUND"));
		userRepository.delete(user);
		return "USER DELETED WITH SUCCESS";
	}

	
}
