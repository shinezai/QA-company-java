package com.appleyk.repository;

import com.appleyk.node.Account;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface AccountRepository extends GraphRepository<Account>{
	
	 @Query("MATCH (n:Account) where n.value='17000.00' return n")
	 List<Account> getAccount(@Param("name") String name);

	 List<Account> findByYear(@Param("year") String year);
}
