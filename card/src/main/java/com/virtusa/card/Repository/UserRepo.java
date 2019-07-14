package com.virtusa.card.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.card.domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
