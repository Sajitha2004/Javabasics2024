package org.emp;

import org.company.Company;

public class Employee {

	private void empId() {
		System.out.println("The EmpID is 456");
	}
	
	private void empName() {
		System.out.println("The Employee Name is OVISAJI  ");
	}
	
	public static void main (String[] args) {
		Company a = new Company();
		Employee b = new Employee();
		
		a.compId();
		a.compName();
		b.empId();
		b.empName();
	}

}
