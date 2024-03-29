package com.virtusa.card.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CreditCard {

	@Id
	String cardNo;
	
	@ManyToOne
    @JoinColumn
	User user;

	public CreditCard(String cardNo, User user) {
		super();
		this.cardNo = cardNo;
		this.user = user;
	}

	public CreditCard() {
		super();
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}



	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "CreditCard [cardNo=" + cardNo + ", user=" + user + "]";
	}
	
	
}
