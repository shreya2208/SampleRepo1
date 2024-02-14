package com.example.CrudSpringboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.CrudSpringboot.bean.Subject;


public interface SubjectRepository extends CrudRepository<Subject, String>{
	 

}
