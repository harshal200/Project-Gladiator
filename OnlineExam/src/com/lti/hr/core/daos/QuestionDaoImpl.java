package com.lti.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.Question;
import com.lti.hr.core.exception.HrException;

public class QuestionDaoImpl implements QuestionDao{

	@PersistenceContext
	private EntityManager manager;
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public ArrayList<Question> fetchQuestions() throws HrException {
		String strqry="from Question";
		Query qry=manager.createQuery(strqry);
		ArrayList<Question> lst=(ArrayList<Question>) qry.getResultList();
		return lst;
	}

}
