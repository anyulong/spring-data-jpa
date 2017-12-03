package com.example;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.pojo.Employee;
import com.example.service.EmpService;

@SpringBootApplication
public class MyJpaApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(MyJpaApplication.class, args);
		EmpService es = context.getBean(EmpService.class);
		//删除员工编号为10的员工
		//es.remove(10);
//		Employee e = new Employee();
//		e.setName("张三");
//		e.setSalary(BigDecimal.valueOf(80.0));
//		es.insEmployee(e);
//		es.findAll("张三");
//		es.deleteEmployee(1);
		Employee e1 = new Employee();
		e1.setId(2);
		e1.setName("王五");
		es.updEmployee(e1);
	}
}
