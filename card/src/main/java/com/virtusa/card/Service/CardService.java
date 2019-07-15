package com.virtusa.card.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.card.Repository.AddressRepository;
import com.virtusa.card.Repository.CardRepository;
import com.virtusa.card.Repository.UserRepo;
import com.virtusa.card.domain.Address;
import com.virtusa.card.domain.CreditCard;
import com.virtusa.card.domain.User;



@Service
public class CardService {

	@Autowired
	CardRepository cardRepo;
	
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	AddressRepository addressRepo;
	public String SaveCard(User user) {
		Optional<User> returnedUser=getUser(user);
        
		if(!returnedUser.isPresent()) {
			saveUser(user);
		}
			
		String cardNo=getRandom();
		CreditCard card =new CreditCard(cardNo,user);
		System.out.println(card);
		CreditCard savedCard= cardRepo.save(card);
		return savedCard.getCardNo();
	}
	private String getRandom() {
		StringBuilder sb= new StringBuilder();
		sb.append("4250");
		for(int i=0;i<12;i++) {
			sb.append(Math.round(Math.random()*9));
		}
		return String.valueOf(sb);
	}
	
	
	@Transactional
	public User saveUser(User user){
		return userRepo.save(user);
	}
	
	@Transactional
	public Optional<User> getUser(User user){
		try {
			Optional<User> returnedUser=userRepo.findById(user.getUserId());
			return returnedUser;
		}
		catch(Exception e) {
			return null;
		}
		
	}
}
