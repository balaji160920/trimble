package com.trimblecar.trimble.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trimblecar.trimble.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

	List<Car> findByStatus(String status);

	//Car save(Car car);
}
