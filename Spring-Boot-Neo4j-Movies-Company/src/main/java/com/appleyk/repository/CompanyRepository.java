package com.appleyk.repository;

import com.appleyk.node.Company;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CompanyRepository extends GraphRepository<Company>{
	 List<Company> findByCpName(@Param("cpname") String cpname);
}
