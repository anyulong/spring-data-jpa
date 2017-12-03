package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.EmpService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyJpaApplicationTests {

	@Autowired
	EmpService es;
	@Test
	public void contextLoads() {
		es.remove(10);
	}

}
