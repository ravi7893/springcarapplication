package com.cars.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cars.beans.Payment;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment,Long> {
	
	/*To Retrive the data of payment details from database using Id */
	@Query("select p from Payment p where p.paymentId=?1")
	Optional<Payment> getId(Long id);
	
	/*To Retrive the data of payment details from database using Id */
	@Query("Select e from Payment e order by e.paymentId") 
	List<Payment> findByPaymentIdSorted();
	
}
