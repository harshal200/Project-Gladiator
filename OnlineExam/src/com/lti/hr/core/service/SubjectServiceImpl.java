package com.lti.hr.core.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.hr.core.daos.SubjectDao;
import com.lti.hr.core.entities.Subject;
import com.lti.hr.core.exception.HrException;

@Service
public class SubjectServiceImpl implements SubjectService{
	
	@Autowired
	SubjectDao dao;
	
	@Override
	public ArrayList<Subject> fetchSubjectDetails() throws HrException {

		return dao.fetchSubjectDetails();
	}

}
