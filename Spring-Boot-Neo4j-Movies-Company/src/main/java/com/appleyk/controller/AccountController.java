package com.appleyk.controller;

import com.appleyk.node.Account;
import com.appleyk.repository.AccountRepository;
import com.appleyk.result.ResponseMessage;
import com.appleyk.result.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/appleyk/account")
public class AccountController {
	
	@Autowired
	AccountRepository accountRepository;  

	/**
	 * 根据年份查询Account实体
	 * @param year
	 * @return
	 */
    @RequestMapping("/get")  
    public List<Account> getAccounts(@RequestParam(value="year") String year){
    	return accountRepository.findByYear(year);
    }  
      
    /**
     * 创建一个account节点
     * @param account
     * @return
     */
    @PostMapping("/save")  
    public ResponseResult saveAccount(@RequestBody Account account){      	
    	accountRepository.save(account);
    	return new ResponseResult(ResponseMessage.OK);
    }  
}
