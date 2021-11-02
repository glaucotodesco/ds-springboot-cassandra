package com.cassandra.product.model.dto;

import java.util.UUID;

import com.cassandra.product.model.entities.Department;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {

	private UUID id;
	private String name;
	
	public DepartmentDTO(Department entity) {
		this.id = entity.getId();
		this.name = entity.getName();
	}
}