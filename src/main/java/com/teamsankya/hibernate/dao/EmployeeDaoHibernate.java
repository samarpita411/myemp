package com.teamsankya.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.teamsankya.hibernate.dto.DepartmentBean;
import com.teamsankya.hibernate.dto.EmployeeAddressBean;
import com.teamsankya.hibernate.dto.EmployeeBean;
import com.teamsankya.hibernate.dto.EmployeeContactBean;
import com.teamsankya.hibernate.dto.EmployeeMasterBean;
import com.teamsankya.hibernate.dto.EmployeeTaskBean;

public class EmployeeDaoHibernate
{
	private final static Configuration CONFIG=new Configuration();
	
	private final static SessionFactory FACTORY=CONFIG.configure().
			buildSessionFactory();

	public boolean createEmp(EmployeeBean bean)
	{
		Session session= FACTORY.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(bean);
//		session.save(contactBean);
//		session.save(addressBean);
//		for(EmployeeTaskBean employeeTaskBean2 : employeeTaskBean) 
//		{
//			session.save(employeeTaskBean2);
//			
//		} 
		transaction.commit();
		 
		return true;
	}
	
	public boolean createDepartment(DepartmentBean departmentBean)
	{
		Session session= FACTORY.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(departmentBean);
		transaction.commit();
		return true;
	}
	
	
//	public boolean createEmp(EmployeeBean bean)
//	{
//		Session session= FACTORY.openSession();
//		Transaction transaction=session.beginTransaction();
//		session.save(bean);
//		transaction.commit();
//		
//		return true;
//	}
	
	
	public EmployeeBean getEmpData(int id)
	{
		Session session= FACTORY.openSession();
		EmployeeBean bean=session.get(EmployeeBean.class,1);
		
		return bean ;
	}
	
//	public EmployeeMasterBean getEmpData(int id)
//	{
//		Session session= FACTORY.openSession();
//		EmployeeBean bean=session.get(EmployeeBean.class,1);
//		EmployeeAddressBean addressBean=session.get(EmployeeAddressBean.class,1);
//		EmployeeContactBean contactBean=session.get(EmployeeContactBean.class,1);
//		EmployeeTaskBean taskBean=session.get(EmployeeTaskBean.class,1);
//		
//		EmployeeMasterBean masterBean=new EmployeeMasterBean();
//		masterBean.setEmployeeBean(bean);
//		masterBean.setEmployeeAddressBean(addressBean);
//		masterBean.setEmployeeContactBean(contactBean);
//		masterBean.setEmployeeTaskBean(taskBean);
//		return masterBean ;
//	}
	
	public boolean deleteEmp(int id)
	{
		EmployeeBean bean=new EmployeeBean();
		bean.setId(id);
		Session session= FACTORY.openSession();
		Transaction transaction=session.beginTransaction();
		session.delete(bean);
		transaction.commit();
		
		return true;
	}
	
	public boolean updateEmp(EmployeeBean bean)
	{
		Session session= FACTORY.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(bean);
		transaction.commit();
		
		return true;
	}
	
	
	
	
	
	
}
