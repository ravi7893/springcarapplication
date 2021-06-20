package com.cars.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.advices.ResourceNotFoundException;
import com.cars.beans.Car;
import com.cars.service.CarService;


@RestController
@RequestMapping(path="/car")
public class CarController {

	@Autowired	/* To connect with the car service and add dependency Injection */
	CarService carservice;
	
	/* To Add new car details in the database */
	@PostMapping(path="/addCar")
	public ResponseEntity<Car> addCar(@RequestBody Car car) throws ResourceNotFoundException
	{
		Car e1=carservice.addCar(car);
		ResponseEntity<Car> re=new ResponseEntity<Car>(e1,HttpStatus.OK);
		return re;
	}
	
	/* To update the details in the database */
	@PutMapping(path="/updateCar/{id}")
	public ResponseEntity<Car> updateCar(@PathVariable long id, Car car) throws Exception
	{
		Car e1=carservice.updateCar(id, car);
		ResponseEntity<Car> re=new ResponseEntity<Car>(e1,HttpStatus.OK);
		return re;
	}
	
	/* To get all the details present in the database */
	@GetMapping(path="/getAllCars")
	public ResponseEntity<List<Car>> getAllCars()
	{
		List<Car> le=carservice.getAllCars();
		
		ResponseEntity<List<Car>> re=new ResponseEntity<List<Car>>(le,HttpStatus.OK);
		return re;
	}
	
	/* To get the details from database based on model */
	@GetMapping(path="/getCarsByModel/{model}")
	public ResponseEntity<List<Car>> getCarsByModel(@PathVariable String model)
	{
		List<Car> le=carservice.getCarsByModel(model);
		ResponseEntity<List<Car>> re=new ResponseEntity<List<Car>>(le,HttpStatus.OK);
		return re;
	}
	
	/* To get the details from database based on brand */
	@GetMapping(path="/getCarsByBrand/{brand}")
	public ResponseEntity<List<Car>> getCarsByBrand(@PathVariable String brand)
	{
		List<Car> le=carservice.getCarsByBrand(brand);
		ResponseEntity<List<Car>> re=new ResponseEntity<List<Car>>(le,HttpStatus.OK);
		return re;
	}
	
	/* To get the details from database based on price */
	@GetMapping(path="/getCarsByPrice/{price}")
	public ResponseEntity<List<Car>> getCarsByPrice(@PathVariable long price)
	{
		List<Car> le=carservice.getCarsByPrice(price);
		ResponseEntity<List<Car>> re=new ResponseEntity<List<Car>>(le,HttpStatus.OK);
		return re;
	}
	
	/* To get the details from database based on Id */
	@GetMapping(path="/getCar/{id}")
	public ResponseEntity<Car> getCar(@PathVariable long id) throws Exception
	{
		Car e1=carservice.getCar(id);
		ResponseEntity<Car> re=new ResponseEntity<Car>(e1,HttpStatus.OK);
		return re;
	}
	
	/* To Delete the details from database based on Id */
	@DeleteMapping(path="/removeCar/{id}")
	public ResponseEntity<String> removeCarbyId(@PathVariable Long id) throws Exception
	{
		carservice.removeCarbyId(id);
		ResponseEntity<String> re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	
	
	
	

}
