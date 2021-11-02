package com.cassandra.product.repositories;


import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.cassandra.product.model.entities.Product;



public interface ProductRepository extends CassandraRepository<Product, UUID> {


}
