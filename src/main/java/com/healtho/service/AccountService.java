package com.healtho.service;

import java.util.List;

import com.healtho.Entity.Account;
import com.healtho.Entity.PlanManagement;

public interface AccountService {
	
	public Account createAccount(Account account);
	public List<Account> findAllAccounts();
	public Integer updateAccount(Integer accountId);
	public void deleteAccount(Integer accountId);

        public void getAccount();

}
