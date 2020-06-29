package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.User;

//como já está herdando do jparepository, não é necessário o @Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
