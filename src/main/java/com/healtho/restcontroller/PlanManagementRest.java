package com.healtho.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healtho.Entity.PlanManagement;
import com.healtho.service.PlanManagementService;


@RestController
public class PlanManagementRest {
	
	@Autowired
	private PlanManagementService planManagementService;
	

	@PostMapping(value = "/createPlan", consumes = {"application/json" }, produces = {"application/json"})
	public ResponseEntity<PlanManagement> createPlan(@RequestBody PlanManagement planManagement)
	{
		System.out.println(planManagement);
		PlanManagement planInfo = planManagementService.createPlan(planManagement);
		return new ResponseEntity<PlanManagement>(planInfo,HttpStatus.CREATED);

	}
	
	
	

}
