package com.lti.hr.core.service;

import java.util.ArrayList;

import com.lti.hr.core.entities.Subject;
import com.lti.hr.core.exception.HrException;

public interface SubjectService {
	public ArrayList<Subject> fetchSubjectDetails() throws HrException;

}
