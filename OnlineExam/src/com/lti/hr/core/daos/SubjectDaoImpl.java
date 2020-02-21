package com.lti.hr.core.daos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.Subject;
import com.lti.hr.core.exception.HrException;

public class SubjectDaoImpl implements SubjectDao {
	
	@PersistenceContext
	private EntityManager manager;

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public ArrayList<Subject> fetchSubjectDetails() throws HrException {
		String strqry="from Subject";
		Query qry=manager.createQuery(strqry);
		ArrayList<Subject> lst=(ArrayList<Subject>) qry.getResultList();
		return lst;
	}
}
	
