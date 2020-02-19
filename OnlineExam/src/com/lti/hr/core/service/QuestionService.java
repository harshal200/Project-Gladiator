package com.lti.hr.core.service;

import java.util.ArrayList;


import com.lti.hr.core.entities.Question;
import com.lti.hr.core.exception.HrException;


public interface QuestionService {

	public ArrayList<Question> fetchQuestions() throws HrException;
}
