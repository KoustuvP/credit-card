package com.virtusa.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.bank.client.CardProxy;
import com.virtusa.bank.domain.User;

@Service
public class BankService {

	@Autowired
	CardProxy proxy;
	
	public String saveCard(User user) {
		return proxy.saveCard(user);

	}
}
