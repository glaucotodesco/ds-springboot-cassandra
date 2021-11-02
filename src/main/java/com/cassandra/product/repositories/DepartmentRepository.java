package com.cassandra.product.repositories;

import java.util.UUID;
import com.cassandra.product.model.entities.Department;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface DepartmentRepository extends CassandraRepository<Department, UUID> {

}
