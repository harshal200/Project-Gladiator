package com.lti.hr.core.daos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.hr.core.entities.Admin;
import com.lti.hr.core.entities.UserRegister;
import com.lti.hr.core.exception.HrException;

@Repository
public class AdminDaoImpl implements AdminDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public boolean AddQuestion(Admin admin) throws HrException {
		System.out.println("Data reached dao: " + admin);
//		manager.merge(admin);
		manager.persist(admin);
		return true;
	}

	@Override
	public boolean DeleteQuestion(Admin admin) throws HrException {
		System.out.println("Data reached dao: " + admin);
//		manager.merge(admin);
		manager.persist(admin);
		return true;
	}

	@Override
	public ArrayList<Admin> ViewReportGeneration() throws HrException {
		String strqry="from Admin";
		Query qry=manager.createQuery(strqry);
		//Query qry = manager.createQuery("from ureg");
		List<Admin> lst=qry.getResultList();
		return  (ArrayList<Admin>) lst;
	}
	
	

}
