package com.example.pojo;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer>{
	
	@Query("SELECT e FROM Employee e where e.name = :name")
	List<Employee> findByName(@Param("name") String name12345);
	
	
}
