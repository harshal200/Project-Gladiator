package com.lti.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.ExamResult;
import com.lti.hr.core.entities.Question;
import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

public class ExamResultDaoImpl implements ExamResultDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean insertExamResult(ExamResult examResult) throws HrException {
		System.out.println("Data reached dao: " +examResult);
//		manager.merge(examResult);
		manager.persist(examResult);
		return true;
	}

	@Override
	public ArrayList<ExamResult> fetchQuestions() throws HrException {
		String strqry="ExamResult";
		Query qry=manager.createQuery(strqry);
		ArrayList<ExamResult> lst=(ArrayList<ExamResult>) qry.getResultList();
		return lst;
	}

	}

