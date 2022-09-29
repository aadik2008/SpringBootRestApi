package com.springbootrest.springbootrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootrest.springbootrest.entities.Patient;

public interface PatientDao extends JpaRepository<Patient, Long> {

}
