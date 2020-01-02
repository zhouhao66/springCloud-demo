package com.zhouhao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import entities.Dept;

@Mapper
public interface deptDao {
	
	public boolean addDept(Dept dept);
	
	public Dept findById(long id);
	
	public List<Dept> findAll();
}
