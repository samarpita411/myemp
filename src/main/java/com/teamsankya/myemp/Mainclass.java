package com.teamsankya.myemp;

import java.util.ArrayList;

import com.teamsankya.hibernate.dao.EmployeeDaoHibernate;
import com.teamsankya.hibernate.dto.EmployeeAddressBean;
import com.teamsankya.hibernate.dto.EmployeeBean;
import com.teamsankya.hibernate.dto.EmployeeContactBean;
import com.teamsankya.hibernate.dto.EmployeeTaskBean;

/**
 * Hello world!
 *
 */
public class Mainclass 
{
    public static void main( String[] args )
    {
//        EmployeeBean bean=new EmployeeBean();
////        bean.setId(5);
////        bean.setFnm("tom");
////        bean.setLnm("titus");
////      
//        EmployeeDaoHibernate impl=new EmployeeDaoHibernate();
////        impl.createEmp(bean);
//        
////        bean=impl.getEmpData(1);
////        System.out.println(bean);
//        
//        
////        impl.deleteEmp(5);
//         impl.updateEmp(bean);
    	
    	
    	
//    	EmployeeBean bean=new EmployeeBean();
//        bean.setId(5);
//        bean.setFnm("Nadine");
//        bean.setLnm("titus");
//        
//        EmployeeAddressBean addressBean=new EmployeeAddressBean();
//        addressBean.setEmpBean(bean);
//        addressBean.setPincode(567876);
//        addressBean.setAddress1("234");
//        addressBean.setAddress2("lane 12");
//        addressBean.setCity("pune");
//        
//        
//        EmployeeContactBean  contactBean=new EmployeeContactBean();
//        contactBean.setEmpBean(bean);
//        contactBean.setPhnum(1231239777);
//        contactBean.setEmail("nadine@gmail.com");
//        
//        EmployeeTaskBean taskBean1=new EmployeeTaskBean();
//        taskBean1.setEmpBean(bean);
//        taskBean1.setTaskId(1);
//        taskBean1.setTaskInfo("organize the party theme");
//        
//        EmployeeTaskBean taskBean2=new EmployeeTaskBean();
//        taskBean2.setEmpBean(bean);
//        taskBean2.setTaskId(2);
//        taskBean2.setTaskInfo("set the guest list");
//        
//        EmployeeTaskBean taskBean3=new EmployeeTaskBean();
//        taskBean3.setEmpBean(bean);
//        taskBean3.setTaskId(3);
//        taskBean3.setTaskInfo("hire the caterers");
//        
//        ArrayList<EmployeeTaskBean> list=new ArrayList<EmployeeTaskBean>();
//        list.add(taskBean1);
//        list.add(taskBean2);
//        list.add(taskBean3);
//        
//        
//        
          EmployeeDaoHibernate impl=new EmployeeDaoHibernate();
//        impl.createEmp(bean, contactBean, addressBean,list);
//      
    	
          impl.getEmpData(11);	
        
    }
}
