package com.healtho.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.healtho.Entity.Account;
import com.healtho.service.AccountService;

@RestController
public class AccountRestController {
	
	@Autowired
	private AccountService accountService;
	

	@PostMapping(value = "/createAccount", consumes = {"application/json" }, produces = {"application/json"})
	public ResponseEntity<Account> createAccount(@RequestBody Account account)
	{
	    Account createAccount = accountService.createAccount(account);
		return new ResponseEntity<Account>(createAccount,HttpStatus.CREATED);

	}
	
	
	

}
