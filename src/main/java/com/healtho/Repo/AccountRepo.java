package com.healtho.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.healtho.Entity.Account;

public interface AccountRepo extends JpaRepository<Account, Integer>{

}
