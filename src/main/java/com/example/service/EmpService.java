package com.example.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pojo.EmpRepository;
import com.example.pojo.Employee;

@Service
@Transactional
public class EmpService {
	@PersistenceContext
	private EntityManager em;
	@Autowired
	EmpRepository er;

	// 删除员工
	public void remove(int id) {

		Employee e = em.find(Employee.class, id);
		if (e != null) {
			em.remove(e);
		}
	}

	public void findAll(String name) {
		System.out.println(er.findByName(name));
	}
	//增加
	public void insEmployee(Employee e) {

		er.saveAndFlush(e);
	}
	//删除
	public void deleteEmployee(int id) {
		er.delete(id);
	}
	//修改
	public void updEmployee(Employee e) {
		er.saveAndFlush(e);
	}
}
