package com.zhouhao.controller;
/**
 * RestTemplate提供了多种便携访问远程http服务的方法
 * 是一种简单便捷的访问restful服务模板类，是spring提供用于访问Rest服务的客户端模板工具集
 * @author Administrator
 *
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import entities.Dept;
@RestController
public class deptController_Consumer {
	private static final String REST_URL_PREFIX="http://localhost:8001";
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("consumer/addDept")
	public boolean add(Dept dept) {
		return restTemplate.postForObject(REST_URL_PREFIX+"dept/add", dept, Boolean.class);
	}
	
	@RequestMapping("consumer/getDept/{id}")
	public Dept get( @PathVariable("id") long id) {
		return restTemplate.getForObject(REST_URL_PREFIX+"dept/findById/"+id, Dept.class);
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping("consumer/getAllDept")
	public List<Dept> getAll(){
		return restTemplate.getForObject(REST_URL_PREFIX+"dept/findAll", List.class);
	}
	
}
