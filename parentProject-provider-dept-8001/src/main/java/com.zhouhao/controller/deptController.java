package com.zhouhao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhouhao.service.deptService;

import entities.Dept;

@RestController
public class deptController {
	
	@Autowired
	private deptService deptService;
	
	@RequestMapping("dept/add")
	public boolean add(@RequestBody Dept dept) {
		return deptService.addDept(dept);
	}
	
	@RequestMapping("dept/findById/{id}")
	public Dept fingById(@PathVariable long id) {
		
		return deptService.findById(id);
	}
	
	@RequestMapping("dept/findAll")
	public List<Dept> findAll(){
		return deptService.findAll();
	}
}
