package com.springbootrest.springbootrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.springbootrest.entities.Patient;
import com.springbootrest.springbootrest.services.PatientService;
import com.springbootrest.springbootrest.controller.PatientController;


////Rest: Representational State Transfer
@RestController
public class PatientController {

	// yahan automatically inject ho rha hai
	@Autowired
	private PatientService patientService;

	
	// If i want to get all Patients Details
	@GetMapping("/patients")
	public List<Patient> getPatients() {
		return this.patientService.getPatients();
	}

	
	// If i want to get a single patient details with his/her id
	@GetMapping("/patients/{patientId}")
	public Patient getCourse(@PathVariable("patientId") Long patientId) {
		Patient patient = new Patient();
		try {
			patient = patientService.getPatient(patientId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return patient;
	}
	
	
	
	//If i want to add single patient details
	@PostMapping("/patients")
	public Patient addCourse(@RequestBody Patient patient)
	{
		return this.patientService.addPatient(patient);
	}
	
	
	
	//If Patient has previous existing id then i can update their details
	@PutMapping("/patients")
	public Patient updatePatient(@RequestBody Patient patient)
	{
		return this.patientService.updatePatient(patient);
	}

	
	
	
	//To delete patient's detail through previous existing patient id
	@DeleteMapping("/patients/{patientId}")
    public void deletePatient(@PathVariable("patientId") Long patientId){
    	patientService.deletePatient(patientId);
    }
}
