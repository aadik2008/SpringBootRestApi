package com.springbootrest.springbootrest.services;

import java.util.List;

import com.springbootrest.springbootrest.entities.Patient;

public interface PatientService {

	public List<Patient> getPatients();

	public Patient getPatient(Long patientId) throws Exception;

	public Patient addPatient(Patient patient);

	public Patient updatePatient(Patient patient);

	public void deletePatient(Long patientId);

}
