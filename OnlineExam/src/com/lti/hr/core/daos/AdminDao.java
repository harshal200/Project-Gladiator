package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.entities.Admin;
import com.lti.hr.core.exception.HrException;

public interface AdminDao {
	
	public boolean AddQuestion(Admin  admin) throws HrException;
	public boolean DeleteQuestion(Admin  admin) throws HrException;
	public ArrayList<Admin> ViewReportGeneration() throws HrException;

}
