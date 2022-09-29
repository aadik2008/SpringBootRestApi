package com.springbootrest.springbootrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.springbootrest.dao.PatientDao;
import com.springbootrest.springbootrest.entities.Patient;

@Service
public class PatientServiceImplementation implements PatientService{
	
	@Autowired
	private PatientDao patientDao;
	
	public PatientServiceImplementation(){
		
	}

	@Override
	public List<Patient> getPatients() {
		return patientDao.findAll();
	}

	@Override
	public Patient getPatient(Long patientId) throws Exception {
		Patient patient= patientDao.findById(patientId).get();
		if(patient == null)
		{
			throw new Exception("Patient's id not found");
		}
		return patient;
	}

	@Override
	public Patient addPatient(Patient patient) {
		patientDao.save(patient);
	    return patient;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		patientDao.save(patient);
	    return patient;	}

	@Override
	public void deletePatient(Long patientId) {
		patientDao.deleteById(patientId);
		
	}

}
