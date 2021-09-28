package com.healtho.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healtho.Entity.Account;
import com.healtho.Entity.PlanManagement;

public interface PlanRepo extends JpaRepository<PlanManagement, Integer>{

}
