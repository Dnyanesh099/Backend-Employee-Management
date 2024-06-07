package com.Dnyanesh.Employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Dnyanesh.Employee.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long>{

}
