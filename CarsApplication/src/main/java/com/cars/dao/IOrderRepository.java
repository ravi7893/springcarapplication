package com.cars.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.beans.Order;

@Repository
public interface IOrderRepository extends JpaRepository<Order,Long> {
	
	/*@Query("Select a from Order a where a.orderId=?1")
	  Order updateOrder(Long id);*/
	

}
