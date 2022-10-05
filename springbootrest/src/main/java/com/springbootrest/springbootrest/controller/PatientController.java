package com.springbootrest.springbootrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
		@GetMapping("/getAllPatients")
		public ResponseEntity<List<Patient>> getPatients() {
			
			List<Patient> list=patientService.getPatients(); 
			if(list.size()<=0)
			{
				return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
			}
			return ResponseEntity.of(Optional.of(list));
		}


	
	// If i want to get a single patient details with his/her id
	@GetMapping("/getPatientById/{patientId}")
	public Patient getPatient(@PathVariable("patientId") Long patientId) {
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
	@PostMapping("/createPatient")
	public Patient addPatient(@RequestBody Patient patient)
	{
		return this.patientService.addPatient(patient);
	}
	
	
	
	//If Patient has previous existing id then i can update their details
	@PutMapping("/updatePatient")
	public Patient updatePatient(@RequestBody Patient patient)
	{
		return this.patientService.updatePatient(patient);
	}

	
	
	
	//To delete patient's detail through previous existing patient id
	@DeleteMapping("/deletePatient/{patientId}")
    public void deletePatient(@PathVariable("patientId") Long patientId){
    	patientService.deletePatient(patientId);
    }
}
