package com.lti.hr.core.daos;

import java.util.ArrayList;

import com.lti.hr.core.entities.Subject;
import com.lti.hr.core.exception.HrException;

public interface SubjectDao {
	
	public ArrayList<Subject> fetchSubject() throws HrException;

}
