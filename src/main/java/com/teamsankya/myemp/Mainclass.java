package com.teamsankya.myemp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.teamsankya.hibernate.dao.EmployeeDaoHibernate;
import com.teamsankya.hibernate.dto.DepartmentBean;
import com.teamsankya.hibernate.dto.EmployeeAddressBean;
import com.teamsankya.hibernate.dto.EmployeeAddressPk;
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
//          EmployeeBean bean=impl.getEmpData(11);
    	
//          DepartmentBean departmentBean=new DepartmentBean();
//          departmentBean.setDepartmentId(101);
//          departmentBean.setDepartmentName("Web development");
//          departmentBean.setEmpBean(Arrays.asList(bean));
//          impl.createDepartment(departmentBean);
 
          EmployeeBean bean=new EmployeeBean();
          bean.setId(16);
          bean.setFnm("Ronald");
          bean.setLnm("Allen");
          
          EmployeeAddressPk empAddressPk1=new EmployeeAddressPk();
          empAddressPk1.setEmpBean(bean);
          empAddressPk1.setAddressType("P");
          EmployeeAddressPk empAddressPk2=new EmployeeAddressPk();
          empAddressPk2.setEmpBean(bean);
          empAddressPk2.setAddressType("T");
          
          EmployeeAddressBean empAddressBean1=new EmployeeAddressBean();
          empAddressBean1.setEmpAddressPk(empAddressPk1);
          empAddressBean1.setAddress1("456");
          empAddressBean1.setAddress2("street 121");
          empAddressBean1.setCity("pune");
          empAddressBean1.setPincode(178652);
          
          empAddressBean1.setEmpAddressPk(empAddressPk2);
          empAddressBean1.setAddress1("111");
          empAddressBean1.setAddress2("lane 567");
          empAddressBean1.setCity("Indore");
          empAddressBean1.setPincode(333669);
          
          bean.setEmpAddressBean(Arrays.asList(empAddressBean1));
          
          EmployeeContactBean empContactBean=new  EmployeeContactBean();
          empContactBean.setEmpBean(bean);
          empContactBean.setEmail("yqert@gmail.com");
          empContactBean.setPhnum(1230985569);
          
          bean.setEmpContactBean(empContactBean);
          
          EmployeeTaskBean empTaskBean1=new EmployeeTaskBean();
          empTaskBean1.setEmpBean(bean);
          empTaskBean1.setTaskId(107);
          empTaskBean1.setTaskInfo("set the tables");
          EmployeeTaskBean empTaskBean2=new EmployeeTaskBean();
          empTaskBean2.setEmpBean(bean);
          empTaskBean2.setTaskId(308);
          empTaskBean2.setTaskInfo("set the guest list");
          EmployeeTaskBean empTaskBean3=new EmployeeTaskBean();
          empTaskBean3.setEmpBean(bean);
          empTaskBean3.setTaskId(109);
          empTaskBean3.setTaskInfo("hire the caterers");
          
          bean.setEmpTaskBean(Arrays.asList(empTaskBean1,empTaskBean2,
          empTaskBean3));
          
          impl.createEmp(bean);
          
          
          
          
          
          
//createEmp
//(EmployeeBean bean, EmployeeContactBean contactBean, 
//EmployeeAddressBean addressBean, List<EmployeeTaskBean> employeeTaskBean)      
          
          
        
    }
}
