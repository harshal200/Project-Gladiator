package com.lti.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import com.lti.hr.core.entities.Question;
import com.lti.hr.core.exception.HrException;

public class QuestionDaoImpl implements QuestionDao{

	@PersistenceContext
	private EntityManager manager;
	
	@Override
	public ArrayList<Question> fetchQuestions() throws HrException {
		String strqry="from question";
		Query qry=manager.createQuery(strqry);
		ArrayList<Question> lst=(ArrayList<Question>) qry.getResultList();
		return lst;
	}

}
