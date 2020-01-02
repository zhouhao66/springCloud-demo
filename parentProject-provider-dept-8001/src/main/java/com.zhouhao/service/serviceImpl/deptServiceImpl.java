package com.zhouhao.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhouhao.dao.deptDao;
import com.zhouhao.service.deptService;

import entities.Dept;

@Service
public class deptServiceImpl implements deptService {
	
	@Autowired
	private deptDao deptDao;
	
	@Override
	public boolean addDept(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept findById(long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		return deptDao.findAll();
	}

}
