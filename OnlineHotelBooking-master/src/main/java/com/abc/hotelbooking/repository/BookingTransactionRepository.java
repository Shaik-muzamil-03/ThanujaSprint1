package com.abc.hotelbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.hotelbooking.entity.BookingTransactions;
@Repository
public interface BookingTransactionRepository extends JpaRepository<BookingTransactions, Integer>{

}
