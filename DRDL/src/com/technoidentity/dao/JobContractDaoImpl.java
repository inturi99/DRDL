package com.technoidentity.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.technoidentity.model.JobContract;
@Repository
public class JobContractDaoImpl implements JobContractDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void addJobContract(JobContract jobContract) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(jobContract);
	}

	@Override
	public void updateJobContract(JobContract jobContract) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(jobContract);
	}

	@Override
	public JobContract getJobContractId(Integer id) {
		// TODO Auto-generated method stub
		JobContract jobContract=(JobContract)sessionFactory.getCurrentSession().load(JobContract.class, new Integer(id));
		
		return jobContract;
	}

	@Override
	public List<JobContract> listJobContracts() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from JobContract").list();
	}

}
