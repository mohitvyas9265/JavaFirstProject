package com.sapient.week8;

import java.util.*;

public class AddEmployee 
{
	List<Employee> list = new ArrayList();
	public void addEmployee(Employee emp)
	{
		if(emp.getId()>0)
			list.add(emp);
	}
	public Employee getEmployee(int id)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getId()==id)
				return list.get(i);
		}
		return null;
	}


}
