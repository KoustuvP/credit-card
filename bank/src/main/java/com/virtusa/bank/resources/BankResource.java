package com.virtusa.bank.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.bank.domain.User;
import com.virtusa.bank.service.BankService;

@RestController
public class BankResource {

	@Autowired
	BankService bankService;
	
	@PostMapping("cards")
	public String saveCard(@RequestBody User user) {
		return bankService.saveCard(user);
		
	}
}
