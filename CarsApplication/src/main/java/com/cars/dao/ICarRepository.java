package com.cars.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cars.beans.Car;
@Repository
public interface ICarRepository extends JpaRepository<Car,Long>  {
	
	/*To Retrive the data of car details from database using Id */
	@Query("Select c from Car c where c.carId=?1")
	Car updateCar(Long id);
	
	/*To Retrive the data of car details from database using model */
	@Query("Select c from Car c where c.model=?1")
	List<Car> getCarsByModel(String model1);
	
	/*To Retrive the data of car details from database using brand */
	@Query("Select c from Car c where c.brand=?1")
	List<Car> getCarsByBrand(String brand1);
	
	/*To Retrive the data of car details from database using price */
	@Query("Select c from Car c where c.price=?1")
	List<Car> getCarsByPrice(long price1);

}
