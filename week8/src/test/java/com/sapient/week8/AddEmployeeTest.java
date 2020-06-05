package com.sapient.week8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;

public class AddEmployeeTest 
{
	AddEmployee addEmp=null;
	Employee emp=null;
	@Before
	public void initial()
	{
		emp=new Employee();
		addEmp=new AddEmployee();
	}
	@Test
	public void testcase1() throws Exception
	{
		emp.setId(1);
		emp.setCity("Delhi");
		emp.setName("Mohit");
		addEmp.addEmployee(emp);
		assertEquals(emp,addEmp.getEmployee(1));
	}
	@Test
	public void testcase2() throws Exception
	{
		assertEquals(null,addEmp.getEmployee(2));
	}
	@Test
	public void testcase3() throws Exception
	{
		emp.setId(-1);
		emp.setCity("Nagpur");
		emp.setName("Steve");
		addEmp.addEmployee(emp);
		assertEquals(null,addEmp.getEmployee(-1));
	}
	

}
