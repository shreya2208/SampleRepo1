package com.example.CrudSpringboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CrudSpringboot.bean.Subject;
import com.example.CrudSpringboot.repository.SubjectRepository;


@Service
public class SubjectService {

	@Autowired
	public SubjectRepository subjectRepository;
	
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects = new ArrayList<>();
		subjectRepository.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		subjectRepository.save(subject);
		
	}

	public void updateSubject(String id, Subject subject) {
		subjectRepository.save(subject);
		
	}

	public void deleteSubject(String id) {
		subjectRepository.deleteById(id);
		
	}

	
	
	
}
