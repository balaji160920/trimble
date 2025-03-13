package com.trimblecar.trimble.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trimblecar.trimble.model.Lease;

@Repository
public interface LeaseRepository extends JpaRepository<Lease, Long> {

	List<Lease> findAll();

	Lease save(Lease lease);

}
