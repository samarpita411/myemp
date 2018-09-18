package com.teamsankya.hibernate.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="empp_task")

public class EmployeeTaskBean implements Serializable
{
	@ManyToOne
	@JoinColumn(name="id", referencedColumnName="id")
	private EmployeeBean empBean;
	@Id
	@Column(name="task_id")
	private int taskId;
	@Column(name="task_info")
	private String taskInfo;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "EmployeeTaskBean [eid=" + empBean.getId() + ", taskId=" 
		+ taskId  +" , taskInfo= "+ taskInfo  +  "]";
	}
	
	
	public EmployeeBean getEmpBean() {
		return empBean;
	}
	public void setEmpBean(EmployeeBean empBean) {
		this.empBean = empBean;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskInfo() {
		return taskInfo;
	}
	public void setTaskInfo(String taskInfo) {
		this.taskInfo = taskInfo;
	}

	
	
	
	
}
