package com.lti.hr.core.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.hr.core.entities.AdminLogin;

import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;
import com.lti.hr.core.service.AdminLoginService;
import com.lti.hr.core.service.UserRegisterService;

@RestController
public class HrController {

	
	  @Autowired private UserRegisterService service;
	  
	  
	  @GetMapping(value = "/userList",produces="application/json") 
	  public @ResponseBody ArrayList<UserRegister> fetch() { 
		  ArrayList<UserRegister> userList = null;
	  try { userList = service.fetch(); } catch(HrException e) {
	  e.printStackTrace(); } return userList; }
	  
	
	  @PostMapping(value="/addUser",consumes="application/json")
	  //@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE) 
	  public void register(@RequestBody UserRegister user) { 
		  System.out.println(user); 
	  try {
	  service.insertNewUser(user); 
	  } 
	  catch (HrException e) {
	  
	  e.printStackTrace(); } }
	 
	  
	  
	/*
	 * @PostMapping(value="/questionList",consumes="application/json") public
	 * ArrayList<Question> displayAllQuestion(){
	 * 
	 * ArrayList<Question> questionList=null;
	 * 
	 * try { questionList = questionService.fetchQuestions(); } catch (HrException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } return
	 * questionList; }
	 */
	 
/*	@Autowired
	private AdminLoginService aservice;
	
	@RequestMapping(name="/adminList", produces="application/json",method=RequestMethod.GET)
	public @ResponseBody ArrayList<AdminLogin> getDeptList(){
	ArrayList<AdminLogin> adminList=null;
			try {
			adminList=aservice.getAdminDetails();
			}
			catch(HrException e) {
				e.printStackTrace();
			}
			return adminList;*/
	
	
	
}

