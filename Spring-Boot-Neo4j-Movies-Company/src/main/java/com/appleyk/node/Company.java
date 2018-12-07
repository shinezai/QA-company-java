package com.appleyk.node;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;


@NodeEntity
public class Company extends BaseEntity {

	private Long cpid;
	private String cpname;

	
	@Relationship(type = "income")
	@JsonProperty("营业收入")
	private List<Account> accounts;

	public Company(){
		
	}
	
	public Long getCpId() {
		return cpid;
	}

	public void setCpId(Long cpid) {
		this.cpid = cpid;
	}

	public String getCpName() {
		return cpname;
	}

	public void setCpName(String cpname) {
		this.cpname = cpname;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
}
