package com.virtusa.card.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.card.Repository.CardRepository;
import com.virtusa.card.domain.CreditCard;
import com.virtusa.card.domain.User;

@Service
public class CardService {

	@Autowired
	CardRepository cardRepo;
	public String SaveCard(User user) {
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
}
