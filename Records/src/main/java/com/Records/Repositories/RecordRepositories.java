package com.Records.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.Records.entities.Employees;

public interface RecordRepositories extends JpaRepository<Employees, Integer> {

}
