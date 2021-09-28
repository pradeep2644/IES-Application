package com.healtho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healtho.Entity.PlanManagement;
import com.healtho.Repo.PlanRepo;

@Service
public class PlanManagementServiceImpl implements PlanManagementService{

	
	@Autowired
	private PlanRepo planRepo;
	@Override
	public PlanManagement createPlan(PlanManagement planManagement) {
		PlanManagement planInfo = planRepo.save(planManagement);
		return planInfo;
	}

}
