package com.cg.jpastart.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)	//each class is represents ony one table		//This annotation must be written only on parent class
public class Employee implements Serializable //wrapping of the data 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;//universal value to represents serializability 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) //generate valu and automaticially incremented 
	private int employeeId; 
	private String name;
	private double salary; //  3 attributes for table
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
}
