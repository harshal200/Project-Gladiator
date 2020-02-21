package com.lti.hr.core.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.hr.core.daos.AdminDao;
import com.lti.hr.core.entities.Admin;
import com.lti.hr.core.exception.HrException;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDao dao;
	
public boolean AddQuestion(Admin admin) throws HrException {
		
		return dao.AddQuestion(admin);
	}
	
@Override
public boolean DeleteQuestion(Admin admin) throws HrException {
	
	return dao.DeleteQuestion(admin);
	}

@Override
public ArrayList<Admin> ViewReportGeneration() throws HrException {
	return dao.ViewReportGeneration();
	}

}
