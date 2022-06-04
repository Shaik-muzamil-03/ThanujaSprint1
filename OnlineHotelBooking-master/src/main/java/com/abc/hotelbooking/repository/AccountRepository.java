package com.abc.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.hotelbooking.entity.HotelAccount;
import com.abc.hotelbooking.entity.User;
@Repository
public interface AccountRepository extends JpaRepository<User, Integer>{

}
