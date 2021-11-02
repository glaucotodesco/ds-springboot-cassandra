package com.cassandra.product.model.entities;

import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(value = "departments")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

	@PrimaryKey
	private UUID id;
	private String name;
}