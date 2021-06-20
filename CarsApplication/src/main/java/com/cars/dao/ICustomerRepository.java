package com.cars.dao;

import java.util.List;
import java.util.Optional;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cars.beans.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long>{
	
	/*To Retrive the data of customer from database using Id */
	@Query("select c from Customer c where c.userId=?1")
	Customer updateCustomer(long userId);
	
	/*To Retrive the data of customer from database using city*/
	@Query("select c from Customer c where c.address.aid in (select a.aid from Address a where a.city=?1)")
	List<Customer>findByCitySorted(String city);
}
