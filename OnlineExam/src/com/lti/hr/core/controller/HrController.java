package com.lti.hr.core.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;
import com.lti.hr.core.service.UserRegisterService;


@RestController
public class HrController {

	
	@Autowired
	private UserRegisterService service;
	
	
	/*
	 * //http://localhost:9090/registerUser/
	 * 
	 * @RequestMapping(method = RequestMethod.POST, consumes =
	 * MediaType.APPLICATION_JSON_VALUE) public User addUser(@RequestBody User
	 * user){ String msg; boolean result=service.addUser(user); if(result){ msg =
	 * "Success"; // response=new
	 * ResponseEntity<String>("User Added",HttpStatus.CREATED); }else{ msg =
	 * "Error"; // response=new
	 * ResponseEntity<String>("User Not Added",HttpStatus.INTERNAL_SERVER_ERROR); }
	 * return user; }
	 */
	//@RequestMapping("/register")
	@PostMapping(value="/register", consumes ="applicatio/json")
	public void register(@RequestBody UserRegister user)
	{
		
	System.out.println(user);
		try {
			service.addUserToTable(user);
		  //System.out.println(user);
		} catch (HrException e)	{
			e.printStackTrace();
		}
	}
	
	@GetMapping(value = "/userlist",produces ="application/json")
	public @ResponseBody ArrayList<UserRegister> fetchFromTable() {
		ArrayList<UserRegister> userList = null;
		try
		{
			userList = service.fetchFromTable();
		}
		catch(HrException e) {
			e.printStackTrace();
		}
		return userList;
	}
	
}
