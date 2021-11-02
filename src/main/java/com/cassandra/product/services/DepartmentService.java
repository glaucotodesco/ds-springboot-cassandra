package com.cassandra.product.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import com.cassandra.product.model.dto.DepartmentDTO;
import com.cassandra.product.model.entities.Department;
import com.cassandra.product.repositories.DepartmentRepository;
import com.cassandra.product.services.exceptions.ResourceNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repository;
	
	public List<DepartmentDTO> findAll() {
		List<Department> list = repository.findAll();
		return list.stream().map(d -> new DepartmentDTO(d)).collect(Collectors.toList());
	}
	
	public DepartmentDTO findById(UUID id) {
		Department entity = getById(id);
		return new DepartmentDTO(entity);
	}
	
	private Department getById(UUID id) {
		Optional<Department> result = repository.findById(id);
		return result.orElseThrow(() -> new ResourceNotFoundException("Id não encontrado"));
	}
}
