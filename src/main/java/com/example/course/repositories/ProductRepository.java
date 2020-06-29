package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Product;

//como já está herdando do jparepository, não é necessário o @Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
