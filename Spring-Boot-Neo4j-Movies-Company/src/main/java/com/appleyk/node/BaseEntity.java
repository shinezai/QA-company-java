package com.appleyk.node;

import org.neo4j.ogm.annotation.GraphId;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


/*
 * 抽取共同的属性字段
 */
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id")
public abstract class BaseEntity {

	/*
	 * Neo4j会分配的ID（节点唯一标识 当前类中有效）
	 */
	@GraphId	// 注解 @GraphId 表明该属性作为实体的标识符，只能使用 Long 类型
	private Long id;	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
