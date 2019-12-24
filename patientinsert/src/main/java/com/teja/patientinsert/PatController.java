package com.teja.patientinsert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
@RestController
public class PatController {
	@Autowired
	private PatDao pd;
	//insert data to mysql databases
	@RequestMapping("savepatient")
	 public void savePatient( String name, Integer age, String gender) {
		 
		 patient pat = new patient();
		 pat.setName(name);
		 pat.setAge(age);
		 pat.setGender(gender);
		 pd.save(pat)	; //http://localhost:8080/savepatient?name=ABC&age=11&gender=female

	}
}*/

public class PatController{
	/*@Autowired    //insert by using querry method
	private PatDao pd;
@RequestMapping("savepatient/{name}/{age}/{gender}")
public void savePatient( @PathVariable("name") String name, 
		 @PathVariable("age") Integer age, 
		 @PathVariable("gender") String gender) {
	 //http://localhost:8080/savepatient?name=ABC&age=11&gender=female
	 patient patient = new patient();
	 patient.setName(name);
	 patient.setAge(age);
	 patient.setGender(gender);
	 pd.save(patient);
	 
}}*/
	
	/*
	@Autowired
	private PatDao pd;//http://localhost:8080/savepatient?name=ABC&age=11&gender=female
	@RequestMapping("savepatient")
	 public void savePatient(patient pat) {
		 pd.save(pat);
	}}*/
	@Autowired
	private PatDao pd;
	
	 @RequestMapping("patientsave")
	 public void savePatient(@RequestBody
			 patient pt) {
		 pd.save(pt);
	 }}


	
