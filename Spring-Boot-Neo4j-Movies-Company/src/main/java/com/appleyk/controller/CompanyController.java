package com.appleyk.controller;

import com.appleyk.node.Company;
import com.appleyk.repository.CompanyRepository;
import com.appleyk.result.ResponseMessage;
import com.appleyk.result.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/appleyk/company")
public class CompanyController {

	@Autowired
	CompanyRepository companyRepository;

	/**
	 * 根据公司名查询Company实体
	 * 
	 * @param cpname
	 * @return
	 */
	@RequestMapping("/get")
	public List<Company> getCompanies(@RequestParam(value = "cpname") String cpname) {
		return companyRepository.findByCpName(cpname);
	}

	/**
	 * 创建一个公司节点
	 * 
	 * @param company
	 * @return
	 */
	@PostMapping("/save")
	public ResponseResult saveCompany(@RequestBody Company company) {
		companyRepository.save(company);
		return new ResponseResult(ResponseMessage.OK);
	}

}
