package com.trimblecar.trimble.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trimblecar.trimble.model.Lease;
import com.trimblecar.trimble.service.LeaseService;

@RestController
@RequestMapping("/lease")
public class LeaseController {

	 private final LeaseService leaseService;

	    public LeaseController(LeaseService leaseService) {
	        this.leaseService = leaseService;
	    }

	    @PostMapping("/start")
	    public Lease startLease(@RequestBody Lease lease) {
	        return leaseService.startLease(lease);
	    }

	    @GetMapping("/all")
	    public List<Lease> getAllLeases() {
	        return leaseService.getAllLeases();
	    }
	}