package com.lti.hr.core.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.hr.core.daos.QuestionDao;
import com.lti.hr.core.entities.Question;
import com.lti.hr.core.exception.HrException;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	QuestionDao dao;
	
	@Override
	public ArrayList<Question> fetchQuestions() throws HrException {

		return dao.fetchQuestions();
	}

}
