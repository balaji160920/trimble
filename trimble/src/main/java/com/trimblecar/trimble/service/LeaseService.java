package com.trimblecar.trimble.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.trimblecar.trimble.model.Lease;
import com.trimblecar.trimble.repository.LeaseRepository;

@Service
public class LeaseService {
	private final LeaseRepository leaseRepository;

	public LeaseService(LeaseRepository leaseRepository) {
		this.leaseRepository = leaseRepository;
	}

	public Lease startLease(Lease lease) {
		return leaseRepository.save(lease);
	}

	public List<Lease> getAllLeases() {
		return leaseRepository.findAll();
	}
}
