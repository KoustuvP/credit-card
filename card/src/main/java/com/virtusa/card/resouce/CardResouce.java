package com.virtusa.card.resouce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.card.Repository.UserRepo;
import com.virtusa.card.Service.CardService;
import com.virtusa.card.domain.User;

@RestController
public class CardResouce {

	@Autowired
	CardService cardService;
	
	@Autowired
	UserRepo userRepo;
	
	@PostMapping(value="/credit-cards")
	public String saveCard(@RequestBody User user) {
		System.out.println(user);
		return cardService.SaveCard(user);	
	}
	
	@GetMapping(value="/credit-cards/{id}")
	public User getCards(@PathVariable long id){
		System.out.println(id);
		return userRepo.getOne(id);
	}
}
