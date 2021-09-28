package com.healtho.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.healtho.Entity.Account;
import com.healtho.Repo.AccountRepo;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepo accountRepo;
	
	@Override
	public Account createAccount(Account account) {
		Account savedAccount = accountRepo.save(account);
		return savedAccount;
	}

	@Override
	public List<Account> findAllAccounts() {
		List<Account> allAccounts = accountRepo.findAll();
		return allAccounts;
	}

	@Override
	public Integer updateAccount(Integer accountId) {
		return null;
	}

	@Override
	public void deleteAccount(Integer accountId) {
         accountRepo.deleteById(accountId);		
	}

}
