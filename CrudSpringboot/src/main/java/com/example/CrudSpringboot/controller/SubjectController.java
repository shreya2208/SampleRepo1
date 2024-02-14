package com.example.CrudSpringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.CrudSpringboot.bean.Subject;
import com.example.CrudSpringboot.service.SubjectService;


@RestController
public class SubjectController 
{
	@Autowired
	private SubjectService subjectService;
	
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
		
	}
	
	@PostMapping("/subjects")
	public void addSubject(@RequestBody Subject subject)
	{
		subjectService.addSubject(subject);
	}
	
	@PutMapping("/subjects/{id}")
	public void updateSubject(@PathVariable String id,@RequestBody Subject subject)
	{
		subjectService.updateSubject(id, subject);
	}
	
	@DeleteMapping("/subjects/{id}")
	public void deleteSubject(@PathVariable String id)
	{
		subjectService.deleteSubject(id);
	}
}
