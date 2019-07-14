package com.virtusa.bank.client;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.virtusa.bank.domain.User;

@Component
public class CardProxy {

	@Autowired
	RestTemplate restCall;
	
	public String saveCard(User user) {
		
		URI url;
		
		try {
			url = new URI("http://localhost:8050/credit-cards");
			 return restCall.postForObject(url, user, String.class);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "no";
		}
		
	}
	
	@Bean
	public RestTemplate getRest() {
		return new RestTemplate();
	}
}
