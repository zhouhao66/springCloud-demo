package com.zhouhao.service;

import java.util.List;

import entities.Dept;


public interface deptService {
	
	public boolean addDept(Dept dept);
	
	public Dept findById(long id);
	
	public List<Dept> findAll();
}
